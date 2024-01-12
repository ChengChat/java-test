package priv.chengchat.aop;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import priv.chengchat.aop.dispatch.Dispatcher;
import priv.chengchat.aop.worker.WorkerService;


/**
 * 执行结果

 experimentEnable closed executing calcNumberA
 ...performing addition operation, result = 8...
 experimentEnable closed executing useNewVersion
 ...executing new version...
 experimentEnable closed executing calcNumberA
 ...performing addition operation, result = 8...
 experimentEnable closed executing useNewVersion
 ...executing new version...

在控制台输入 true 后
 switching switches
 the switch has been switched, experimentEnable = true
 experimentEnable opened, executing calcNumberB
 ...performing multiplication operation, result = 15...
 experimentEnable opened, executing useOldVersion
 ...executing old version...
 experimentEnable opened, executing calcNumberB
 ...performing multiplication operation, result = 15...
 experimentEnable opened, executing useOldVersion
 ...executing old version...

 */
public class Main {

  private static final ExecutorService workerThread = Executors.newSingleThreadExecutor();
  private static final ExecutorService dispatchThread = Executors.newSingleThreadExecutor();
  private static final WorkerService workerService = new WorkerService();
  private static final Dispatcher dispatcher = new Dispatcher();

  public static void main(String[] args) {
    workerThread.execute(workerService::work);
    dispatchThread.execute(dispatcher::dispatch);
  }
}