package com.xiang.demo.java.thread.countdownlatch;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @ClassNmae ApplicationStartupUtil
 * @Description 这个类是一个主启动类，它负责初始化闭锁，
 * 然后等待，直到所有服务都被检测完。<p>
 * @author xianghairui@outlook.com
 * @Date 2017年5月4日 下午3:48:13
 */
public class ApplicationStartupUtil {

	//List of service checkers
	private static List<BaseHealthChecker> _services;
	
	//This latch will be used to wait on
	private static CountDownLatch _latch;
	
	private ApplicationStartupUtil(){}
	
	private final static ApplicationStartupUtil INSTANCE = new ApplicationStartupUtil();
	
	public static ApplicationStartupUtil getInstance() {
		return INSTANCE;
	}
	
	public static boolean checkExternalServices() throws InterruptedException {
		
		//Initialize the latch with number of service checkers
		_latch = new CountDownLatch(3);
		
		//All add checker in lists
		_services = new ArrayList<BaseHealthChecker>();
		
		_services.add(new NetworkHealthChecker(_latch));
		_services.add(new CacheHealthChecker(_latch));
		_services.add(new DatabaseHealthChecker(_latch));
		
		//Start service checkers using executor framework

		// 手动创建线程池
//		Executor executor = Executors.newFixedThreadPool(_services.size());
		ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("check-external-runner-%d").build();
		int size = _services.size();
		ExecutorService executorService = new ThreadPoolExecutor(size,size,0L,TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>(),namedThreadFactory);

		for(final BaseHealthChecker v : _services) {
			executorService.execute(v);
		}
		
		//Now wait till all services are checked
		_latch.await();
		
		//Services are file and now proceed startup
		for(final BaseHealthChecker v : _services) {
			if(! v.isServiceUp()){
				return false;
			}
		}
		
		return true;
		
	}
	
}
