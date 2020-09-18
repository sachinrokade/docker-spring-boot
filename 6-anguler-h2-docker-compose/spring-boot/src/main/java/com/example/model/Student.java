package com.example.model;

//
//2020-06-22T10:22:27.28+0530 [CELL/0] OUT Cell e3f7d063-352c-4e7d-b208-7c91b098b8f8 stopping instance 691d8950-3652-4292-4828-d4e7
//2020-06-22T10:22:27.29+0530 [CELL/0] OUT Cell e3f7d063-352c-4e7d-b208-7c91b098b8f8 destroying container for instance 691d8950-3652-4292-4828-d4e7
//2020-06-22T10:22:27.32+0530 [API/17] OUT Process has crashed with type: "web"
//2020-06-22T10:22:27.35+0530 [API/17] OUT App instance exited with guid c733dc64-6f3c-4938-b016-76676d2a5c08 payload: {"instance"=>"691d8950-3652-4292-4828-d4e7", "index"=>0, "cell_id"=>"e3f7d063-352c-4e7d-b208-7c91b098b8f8", "reason"=>"CRASHED", "exit_description"=>"APP/PROC/WEB: Exited with status 1", "crash_count"=>5, "crash_timestamp"=>1592801547279906806, "version"=>"fd5fea49-0da0-4c90-9889-386134032985"}
//2020-06-22T10:22:27.55+0530 [PROXY/0] OUT Exit status 137
//2020-06-22T10:22:28.01+0530 [CELL/0] OUT Cell e3f7d063-352c-4e7d-b208-7c91b098b8f8 successfully destroyed container for instance 691d8950-3652-4292-4828-d4e7
//2020-06-22T10:24:39.96+0530 [CELL/0] OUT Cell 4ae961ca-0fe4-4c10-acc6-cffcd81c918a creating container for instance 75ba890d-55a2-4920-7eb6-430e
//2020-06-22T10:24:41.62+0530 [CELL/0] OUT Cell 4ae961ca-0fe4-4c10-acc6-cffcd81c918a successfully created container for instance 75ba890d-55a2-4920-7eb6-430e
//2020-06-22T10:24:42.23+0530 [CELL/0] OUT Downloading droplet...
//2020-06-22T10:24:46.67+0530 [CELL/0] OUT Downloaded droplet (76.7M)
//2020-06-22T10:24:46.67+0530 [CELL/0] OUT Starting health monitoring of container
//2020-06-22T10:24:48.05+0530 [APP/PROC/WEB/0] OUT JVM Memory Configuration: -Xmx428965K -Xss1M -XX:ReservedCodeCacheSize=240M -XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=107610K
//2020-06-22T10:24:53.76+0530 [APP/PROC/WEB/0] OUT  __  __  __     __   ____   ____
//2020-06-22T10:24:53.76+0530 [APP/PROC/WEB/0] OUT  |  \/  | \ \   / /  / ___| |  _ \    ___   _ __ ___     ___
//2020-06-22T10:24:53.76+0530 [APP/PROC/WEB/0] OUT  | |\/| |  \ \ / /  | |     | | | |  / _ \ | '_ ` _ \   / _ \
//2020-06-22T10:24:53.76+0530 [APP/PROC/WEB/0] OUT  | |  | |   \ V /   | |___  | |_| | |  __/ | | | | | | | (_) |
//2020-06-22T10:24:53.76+0530 [APP/PROC/WEB/0] OUT  |_|  |_|    \_/     \____| |____/   \___| |_| |_| |_|  \___/
//2020-06-22T10:24:53.76+0530 [APP/PROC/WEB/0] OUT
//2020-06-22T10:24:54.61+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:54:54.598  INFO 7 --- [           main] pertySourceApplicationContextInitializer : 'cloud' property source added
//2020-06-22T10:24:54.62+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:54:54.623  INFO 7 --- [           main] nfigurationApplicationContextInitializer : Reconfiguration enabled
//2020-06-22T10:24:54.63+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:54:54.636  INFO 7 --- [           main] com.example.MVCDemo                      : Starting MVCDemo on 75ba890d-55a2-4920-7eb6-430e with PID 7 (/home/vcap/app/BOOT-INF/classes started by vcap in /home/vcap/app)
//2020-06-22T10:24:54.63+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:54:54.638  INFO 7 --- [           main] com.example.MVCDemo                      : The following profiles are active: cloud
//2020-06-22T10:24:55.36+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:54:55.363  INFO 7 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@3d71d552: startup date [Mon Jun 22 04:54:55 UTC 2020]; root of context hierarchy
//2020-06-22T10:24:57.52+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:54:57.523  INFO 7 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration$$EnhancerBySpringCGLIB$$af128ca8] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
//2020-06-22T10:24:57.78+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:54:57.780  WARN 7 --- [           main] o.h.v.m.ParameterMessageInterpolator     : HV000184: ParameterMessageInterpolator has been chosen, EL interpolation will not be supported
//2020-06-22T10:24:58.80+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:54:58.807  INFO 7 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8080 (http)
//2020-06-22T10:24:58.83+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:54:58.835  INFO 7 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
//2020-06-22T10:24:58.84+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:54:58.840  INFO 7 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.27
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:54:59.025 ERROR 7 --- [cat-startStop-1] org.apache.catalina.core.ContainerBase   : A child container failed during start
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost].TomcatEmbeddedContext[]]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.report(FutureTask.java:122) [na:1.8.0_252]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.get(FutureTask.java:192) [na:1.8.0_252]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:939) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:872) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1419) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1409) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.run(FutureTask.java:266) [na:1.8.0_252]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_252]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_252]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     at java.lang.Thread.run(Thread.java:748) [na:1.8.0_252]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost].TomcatEmbeddedContext[]]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     ... 6 common frames omitted
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [Pipeline[StandardEngine[Tomcat].StandardHost[localhost].TomcatEmbeddedContext[]]]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5117) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     ... 6 common frames omitted
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [org.apache.catalina.authenticator.NonLoginAuthenticator[]]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardPipeline.startInternal(StandardPipeline.java:182) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     ... 8 common frames omitted
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT Caused by: java.lang.NoSuchMethodError: javax.servlet.ServletContext.getVirtualServerName()Ljava/lang/String;
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.authenticator.AuthenticatorBase.startInternal(AuthenticatorBase.java:1194) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.02+0530 [APP/PROC/WEB/0] OUT     ... 10 common frames omitted
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:54:59.036 ERROR 7 --- [           main] org.apache.catalina.core.ContainerBase   : A child container failed during start
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost]]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.report(FutureTask.java:122) ~[na:1.8.0_252]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.get(FutureTask.java:192) ~[na:1.8.0_252]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:939) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:262) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardService.startInternal(StandardService.java:422) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:793) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.startup.Tomcat.start(Tomcat.java:367) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.initialize(TomcatEmbeddedServletContainer.java:99) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.<init>(TomcatEmbeddedServletContainer.java:84) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getTomcatEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:554) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:179) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.createEmbeddedServletContainer(EmbeddedWebApplicationContext.java:164) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:134) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:537) [spring-context-4.3.14.RELEASE.jar!/:4.3.14.RELEASE]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:122) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:693) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:360) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:303) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1118) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1107) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at com.example.MVCDemo.main(MVCDemo.java:10) [classes/:na]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_252]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_252]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_252]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_252]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:48) [app/:na]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:87) [app/:na]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:50) [app/:na]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:51) [app/:na]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost]]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1419) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1409) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.run(FutureTask.java:266) ~[na:1.8.0_252]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) ~[na:1.8.0_252]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) ~[na:1.8.0_252]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at java.lang.Thread.run(Thread.java:748) ~[na:1.8.0_252]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: A child container failed during start
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:948) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:872) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT     ... 6 common frames omitted
//2020-06-22T10:24:59.03+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:54:59.037  WARN 7 --- [           main] ationConfigEmbeddedWebApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.context.ApplicationContextException: Unable to start embedded container; nested exception is org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
//2020-06-22T10:24:59.06+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:54:59.064  INFO 7 --- [           main] utoConfigurationReportLoggingInitializer :
//2020-06-22T10:24:59.06+0530 [APP/PROC/WEB/0] OUT Error starting ApplicationContext. To display the auto-configuration report re-run your application with 'debug' enabled.
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:54:59.088 ERROR 7 --- [           main] o.s.boot.SpringApplication               : Application startup failed
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT org.springframework.context.ApplicationContextException: Unable to start embedded container; nested exception is org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:137) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:537) ~[spring-context-4.3.14.RELEASE.jar!/:4.3.14.RELEASE]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:122) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:693) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:360) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:303) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1118) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1107) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at com.example.MVCDemo.main(MVCDemo.java:10) [classes/:na]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_252]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_252]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_252]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_252]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:48) [app/:na]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:87) [app/:na]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:50) [app/:na]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:51) [app/:na]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT Caused by: org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.initialize(TomcatEmbeddedServletContainer.java:123) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.<init>(TomcatEmbeddedServletContainer.java:84) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getTomcatEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:554) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:179) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.createEmbeddedServletContainer(EmbeddedWebApplicationContext.java:164) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:134) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     ... 16 common frames omitted
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardServer[-1]]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.startup.Tomcat.start(Tomcat.java:367) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.initialize(TomcatEmbeddedServletContainer.java:99) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     ... 21 common frames omitted
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardService[Tomcat]]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:793) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     ... 23 common frames omitted
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat]]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardService.startInternal(StandardService.java:422) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     ... 25 common frames omitted
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: A child container failed during start
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:948) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:262) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:24:59.08+0530 [APP/PROC/WEB/0] OUT     ... 27 common frames omitted
//2020-06-22T10:24:59.24+0530 [APP/PROC/WEB/0] OUT Exit status 1
//2020-06-22T10:24:59.24+0530 [CELL/SSHD/0] OUT Exit status 0
//2020-06-22T10:25:04.59+0530 [CELL/0] OUT Cell 4ae961ca-0fe4-4c10-acc6-cffcd81c918a stopping instance 75ba890d-55a2-4920-7eb6-430e
//2020-06-22T10:25:04.59+0530 [CELL/0] OUT Cell 4ae961ca-0fe4-4c10-acc6-cffcd81c918a destroying container for instance 75ba890d-55a2-4920-7eb6-430e
//2020-06-22T10:25:04.61+0530 [API/13] OUT Process has crashed with type: "web"
//2020-06-22T10:25:04.63+0530 [API/13] OUT App instance exited with guid c733dc64-6f3c-4938-b016-76676d2a5c08 payload: {"instance"=>"75ba890d-55a2-4920-7eb6-430e", "index"=>0, "cell_id"=>"4ae961ca-0fe4-4c10-acc6-cffcd81c918a", "reason"=>"CRASHED", "exit_description"=>"APP/PROC/WEB: Exited with status 1", "crash_count"=>6, "crash_timestamp"=>1592801704588772155, "version"=>"fd5fea49-0da0-4c90-9889-386134032985"}
//2020-06-22T10:25:04.88+0530 [PROXY/0] OUT Exit status 137
//2020-06-22T10:25:07.66+0530 [CELL/0] OUT Cell 4ae961ca-0fe4-4c10-acc6-cffcd81c918a successfully destroyed container for instance 75ba890d-55a2-4920-7eb6-430e
//2020-06-22T10:29:22.08+0530 [CELL/0] OUT Cell e3f7d063-352c-4e7d-b208-7c91b098b8f8 creating container for instance dfd4c393-bbdd-4da6-5f9b-43fc
//2020-06-22T10:29:23.19+0530 [CELL/0] OUT Cell e3f7d063-352c-4e7d-b208-7c91b098b8f8 successfully created container for instance dfd4c393-bbdd-4da6-5f9b-43fc
//2020-06-22T10:29:23.55+0530 [CELL/0] OUT Downloading droplet...
//2020-06-22T10:29:24.71+0530 [CELL/0] OUT Downloaded droplet
//2020-06-22T10:29:24.71+0530 [CELL/0] OUT Starting health monitoring of container
//2020-06-22T10:29:26.53+0530 [APP/PROC/WEB/0] OUT JVM Memory Configuration: -Xmx428965K -Xss1M -XX:ReservedCodeCacheSize=240M -XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=107610K
//2020-06-22T10:29:30.16+0530 [APP/PROC/WEB/0] OUT  __  __  __     __   ____   ____
//2020-06-22T10:29:30.16+0530 [APP/PROC/WEB/0] OUT  |  \/  | \ \   / /  / ___| |  _ \    ___   _ __ ___     ___
//2020-06-22T10:29:30.16+0530 [APP/PROC/WEB/0] OUT  | |\/| |  \ \ / /  | |     | | | |  / _ \ | '_ ` _ \   / _ \
//2020-06-22T10:29:30.16+0530 [APP/PROC/WEB/0] OUT  | |  | |   \ V /   | |___  | |_| | |  __/ | | | | | | | (_) |
//2020-06-22T10:29:30.16+0530 [APP/PROC/WEB/0] OUT  |_|  |_|    \_/     \____| |____/   \___| |_| |_| |_|  \___/
//2020-06-22T10:29:30.16+0530 [APP/PROC/WEB/0] OUT
//2020-06-22T10:29:30.64+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:59:30.621  INFO 39 --- [           main] pertySourceApplicationContextInitializer : 'cloud' property source added
//2020-06-22T10:29:30.64+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:59:30.646  INFO 39 --- [           main] nfigurationApplicationContextInitializer : Reconfiguration enabled
//2020-06-22T10:29:30.67+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:59:30.677  INFO 39 --- [           main] com.example.MVCDemo                      : Starting MVCDemo on dfd4c393-bbdd-4da6-5f9b-43fc with PID 39 (/home/vcap/app/BOOT-INF/classes started by vcap in /home/vcap/app)
//2020-06-22T10:29:30.67+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:59:30.678  INFO 39 --- [           main] com.example.MVCDemo                      : The following profiles are active: cloud
//2020-06-22T10:29:31.33+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:59:31.338  INFO 39 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@3d71d552: startup date [Mon Jun 22 04:59:31 UTC 2020]; root of context hierarchy
//2020-06-22T10:29:33.66+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:59:33.667  INFO 39 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration$$EnhancerBySpringCGLIB$$87d7bd2b] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
//2020-06-22T10:29:33.90+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:59:33.901  WARN 39 --- [           main] o.h.v.m.ParameterMessageInterpolator     : HV000184: ParameterMessageInterpolator has been chosen, EL interpolation will not be supported
//2020-06-22T10:29:34.56+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:59:34.560  INFO 39 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8080 (http)
//2020-06-22T10:29:34.59+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:59:34.598  INFO 39 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
//2020-06-22T10:29:34.60+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:59:34.600  INFO 39 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.27
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:59:34.886 ERROR 39 --- [cat-startStop-1] org.apache.catalina.core.ContainerBase   : A child container failed during start
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost].TomcatEmbeddedContext[]]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.report(FutureTask.java:122) [na:1.8.0_252]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.get(FutureTask.java:192) [na:1.8.0_252]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:939) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:872) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1419) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1409) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.run(FutureTask.java:266) [na:1.8.0_252]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_252]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_252]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     at java.lang.Thread.run(Thread.java:748) [na:1.8.0_252]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost].TomcatEmbeddedContext[]]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     ... 6 common frames omitted
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [Pipeline[StandardEngine[Tomcat].StandardHost[localhost].TomcatEmbeddedContext[]]]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5117) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     ... 6 common frames omitted
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [org.apache.catalina.authenticator.NonLoginAuthenticator[]]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardPipeline.startInternal(StandardPipeline.java:182) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     ... 8 common frames omitted
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT Caused by: java.lang.NoSuchMethodError: javax.servlet.ServletContext.getVirtualServerName()Ljava/lang/String;
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.authenticator.AuthenticatorBase.startInternal(AuthenticatorBase.java:1194) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.90+0530 [APP/PROC/WEB/0] OUT     ... 10 common frames omitted
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:59:34.911 ERROR 39 --- [           main] org.apache.catalina.core.ContainerBase   : A child container failed during start
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost]]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.report(FutureTask.java:122) ~[na:1.8.0_252]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.get(FutureTask.java:192) ~[na:1.8.0_252]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:939) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:262) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardService.startInternal(StandardService.java:422) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:793) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.startup.Tomcat.start(Tomcat.java:367) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.initialize(TomcatEmbeddedServletContainer.java:99) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.<init>(TomcatEmbeddedServletContainer.java:84) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getTomcatEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:554) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:179) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.createEmbeddedServletContainer(EmbeddedWebApplicationContext.java:164) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:134) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:537) [spring-context-4.3.14.RELEASE.jar!/:4.3.14.RELEASE]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:122) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:693) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:360) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:303) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1118) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1107) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at com.example.MVCDemo.main(MVCDemo.java:10) [classes/:na]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_252]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_252]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_252]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_252]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:48) [app/:na]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:87) [app/:na]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:50) [app/:na]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:51) [app/:na]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost]]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1419) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1409) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.run(FutureTask.java:266) ~[na:1.8.0_252]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) ~[na:1.8.0_252]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) ~[na:1.8.0_252]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at java.lang.Thread.run(Thread.java:748) ~[na:1.8.0_252]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: A child container failed during start
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:948) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:872) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT     ... 6 common frames omitted
//2020-06-22T10:29:34.91+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:59:34.912  WARN 39 --- [           main] ationConfigEmbeddedWebApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.context.ApplicationContextException: Unable to start embedded container; nested exception is org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
//2020-06-22T10:29:34.93+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:59:34.938  INFO 39 --- [           main] utoConfigurationReportLoggingInitializer :
//2020-06-22T10:29:34.93+0530 [APP/PROC/WEB/0] OUT Error starting ApplicationContext. To display the auto-configuration report re-run your application with 'debug' enabled.
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT 2020-06-22 04:59:34.962 ERROR 39 --- [           main] o.s.boot.SpringApplication               : Application startup failed
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT org.springframework.context.ApplicationContextException: Unable to start embedded container; nested exception is org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:137) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:537) ~[spring-context-4.3.14.RELEASE.jar!/:4.3.14.RELEASE]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:122) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:693) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:360) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:303) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1118) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1107) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at com.example.MVCDemo.main(MVCDemo.java:10) [classes/:na]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_252]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_252]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_252]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_252]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:48) [app/:na]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:87) [app/:na]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:50) [app/:na]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:51) [app/:na]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT Caused by: org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.initialize(TomcatEmbeddedServletContainer.java:123) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.<init>(TomcatEmbeddedServletContainer.java:84) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getTomcatEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:554) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:179) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.createEmbeddedServletContainer(EmbeddedWebApplicationContext.java:164) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:134) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     ... 16 common frames omitted
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardServer[-1]]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.startup.Tomcat.start(Tomcat.java:367) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.initialize(TomcatEmbeddedServletContainer.java:99) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     ... 21 common frames omitted
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardService[Tomcat]]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:793) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     ... 23 common frames omitted
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat]]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardService.startInternal(StandardService.java:422) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     ... 25 common frames omitted
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: A child container failed during start
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:948) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:262) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:29:34.96+0530 [APP/PROC/WEB/0] OUT     ... 27 common frames omitted
//2020-06-22T10:29:35.08+0530 [APP/PROC/WEB/0] OUT Exit status 1
//2020-06-22T10:29:35.09+0530 [CELL/SSHD/0] OUT Exit status 0
//2020-06-22T10:29:40.43+0530 [CELL/0] OUT Cell e3f7d063-352c-4e7d-b208-7c91b098b8f8 stopping instance dfd4c393-bbdd-4da6-5f9b-43fc
//2020-06-22T10:29:40.43+0530 [CELL/0] OUT Cell e3f7d063-352c-4e7d-b208-7c91b098b8f8 destroying container for instance dfd4c393-bbdd-4da6-5f9b-43fc
//2020-06-22T10:29:40.46+0530 [API/3] OUT Process has crashed with type: "web"
//2020-06-22T10:29:40.48+0530 [API/3] OUT App instance exited with guid c733dc64-6f3c-4938-b016-76676d2a5c08 payload: {"instance"=>"dfd4c393-bbdd-4da6-5f9b-43fc", "index"=>0, "cell_id"=>"e3f7d063-352c-4e7d-b208-7c91b098b8f8", "reason"=>"CRASHED", "exit_description"=>"APP/PROC/WEB: Exited with status 1", "crash_count"=>7, "crash_timestamp"=>1592801980427273173, "version"=>"fd5fea49-0da0-4c90-9889-386134032985"}
//2020-06-22T10:29:40.69+0530 [PROXY/0] OUT Exit status 137
//2020-06-22T10:29:41.25+0530 [CELL/0] OUT Cell e3f7d063-352c-4e7d-b208-7c91b098b8f8 successfully destroyed container for instance dfd4c393-bbdd-4da6-5f9b-43fc
//2020-06-22T10:32:23.42+0530 [API/11] OUT Updated app with guid c733dc64-6f3c-4938-b016-76676d2a5c08 ({"buildpack"=>"", "disk_quota"=>1024, "health_check_http_endpoint"=>"", "health_check_type"=>"port", "instances"=>1, "memory"=>1024, "name"=>"BootTest-org", "space_guid"=>"54d9c04c-52fe-42b9-9418-3afe7f70211e"})
//2020-06-22T10:32:35.68+0530 [API/12] OUT Uploading bits for app with guid c733dc64-6f3c-4938-b016-76676d2a5c08
//2020-06-22T10:32:47.44+0530 [API/10] OUT Updated app with guid c733dc64-6f3c-4938-b016-76676d2a5c08 ({"state"=>"STOPPED"})
//2020-06-22T10:32:48.08+0530 [API/0] OUT Creating build for app with guid c733dc64-6f3c-4938-b016-76676d2a5c08
//2020-06-22T10:32:49.39+0530 [API/0] OUT Updated app with guid c733dc64-6f3c-4938-b016-76676d2a5c08 ({"state"=>"STARTED"})
//2020-06-22T10:32:49.83+0530 [STG/0] OUT Downloading web_config_transform_buildpack...
//2020-06-22T10:32:49.83+0530 [STG/0] OUT Downloading staticfile_buildpack...
//2020-06-22T10:32:49.83+0530 [STG/0] OUT Downloading java_buildpack...
//2020-06-22T10:32:49.83+0530 [STG/0] OUT Downloading ruby_buildpack...
//2020-06-22T10:32:49.84+0530 [STG/0] OUT Downloading dotnet_core_buildpack...
//2020-06-22T10:32:49.88+0530 [STG/0] OUT Downloaded java_buildpack
//2020-06-22T10:32:49.88+0530 [STG/0] OUT Downloading nodejs_buildpack...
//2020-06-22T10:32:49.88+0530 [STG/0] OUT Downloaded web_config_transform_buildpack
//2020-06-22T10:32:49.88+0530 [STG/0] OUT Downloading go_buildpack...
//2020-06-22T10:32:49.89+0530 [STG/0] OUT Downloaded ruby_buildpack
//2020-06-22T10:32:49.89+0530 [STG/0] OUT Downloading python_buildpack...
//2020-06-22T10:32:49.89+0530 [STG/0] OUT Downloaded dotnet_core_buildpack
//2020-06-22T10:32:49.89+0530 [STG/0] OUT Downloading php_buildpack...
//2020-06-22T10:32:49.90+0530 [STG/0] OUT Downloaded nodejs_buildpack
//2020-06-22T10:32:49.90+0530 [STG/0] OUT Downloading binary_buildpack...
//2020-06-22T10:32:49.92+0530 [STG/0] OUT Downloaded staticfile_buildpack
//2020-06-22T10:32:49.92+0530 [STG/0] OUT Downloading dotnet_core_buildpack_beta...
//2020-06-22T10:32:49.92+0530 [STG/0] OUT Downloaded python_buildpack
//2020-06-22T10:32:49.93+0530 [STG/0] OUT Downloaded go_buildpack
//2020-06-22T10:32:49.94+0530 [STG/0] OUT Downloaded binary_buildpack
//2020-06-22T10:32:49.98+0530 [STG/0] OUT Downloaded dotnet_core_buildpack_beta
//2020-06-22T10:32:50.00+0530 [STG/0] OUT Downloaded php_buildpack
//2020-06-22T10:32:50.00+0530 [STG/0] OUT Cell e68aeb81-7e99-43e6-adbd-a953e79f8e6c creating container for instance af17b6ba-714d-4528-a134-c9887c43cbe2
//2020-06-22T10:32:51.45+0530 [STG/0] OUT Cell e68aeb81-7e99-43e6-adbd-a953e79f8e6c successfully created container for instance af17b6ba-714d-4528-a134-c9887c43cbe2
//2020-06-22T10:32:51.67+0530 [STG/0] OUT Downloading app package...
//2020-06-22T10:32:51.67+0530 [STG/0] OUT Downloading build artifacts cache...
//2020-06-22T10:32:51.94+0530 [STG/0] OUT Downloaded build artifacts cache (129B)
//2020-06-22T10:32:53.36+0530 [STG/0] OUT Downloaded app package (34.2M)
//2020-06-22T10:32:57.45+0530 [STG/0] OUT -----> Java Buildpack v4.31.1 (offline) | https://github.com/cloudfoundry/java-buildpack.git#03e8eec
//2020-06-22T10:32:57.57+0530 [STG/0] OUT -----> Downloading Jvmkill Agent 1.16.0_RELEASE from https://java-buildpack.cloudfoundry.org/jvmkill/bionic/x86_64/jvmkill-1.16.0-RELEASE.so (found in cache)
//2020-06-22T10:32:57.59+0530 [STG/0] OUT -----> Downloading Open Jdk JRE 1.8.0_252 from https://java-buildpack.cloudfoundry.org/openjdk/bionic/x86_64/bellsoft-jre8u252%2B9-linux-amd64.tar.gz (found in cache)
//2020-06-22T10:32:59.00+0530 [STG/0] OUT        Expanding Open Jdk JRE to .java-buildpack/open_jdk_jre (1.4s)
//2020-06-22T10:32:59.00+0530 [STG/0] OUT        JVM DNS caching disabled in lieu of BOSH DNS caching
//2020-06-22T10:32:59.00+0530 [STG/0] OUT -----> Downloading Open JDK Like Memory Calculator 3.13.0_RELEASE from https://java-buildpack.cloudfoundry.org/memory-calculator/bionic/x86_64/memory-calculator-3.13.0-RELEASE.tar.gz (found in cache)
//2020-06-22T10:33:00.47+0530 [STG/0] OUT        Loaded Classes: 15791, Threads: 250
//2020-06-22T10:33:00.50+0530 [STG/0] OUT -----> Downloading Client Certificate Mapper 1.11.0_RELEASE from https://java-buildpack.cloudfoundry.org/client-certificate-mapper/client-certificate-mapper-1.11.0-RELEASE.jar (found in cache)
//2020-06-22T10:33:00.51+0530 [STG/0] OUT -----> Downloading Container Security Provider 1.18.0_RELEASE from https://java-buildpack.cloudfoundry.org/container-security-provider/container-security-provider-1.18.0-RELEASE.jar (found in cache)
//2020-06-22T10:33:00.51+0530 [STG/0] OUT -----> Downloading Spring Auto Reconfiguration 2.11.0_RELEASE from https://java-buildpack.cloudfoundry.org/auto-reconfiguration/auto-reconfiguration-2.11.0-RELEASE.jar (found in cache)
//2020-06-22T10:33:13.99+0530 [STG/0] OUT Exit status 0
//2020-06-22T10:33:13.99+0530 [STG/0] OUT Uploading droplet, build artifacts cache...
//2020-06-22T10:33:13.99+0530 [STG/0] OUT Uploading droplet...
//2020-06-22T10:33:13.99+0530 [STG/0] OUT Uploading build artifacts cache...
//2020-06-22T10:33:14.09+0530 [STG/0] OUT Uploaded build artifacts cache (129B)
//2020-06-22T10:33:15.05+0530 [API/10] OUT Creating droplet for app with guid c733dc64-6f3c-4938-b016-76676d2a5c08
//2020-06-22T10:33:20.26+0530 [STG/0] OUT Uploaded droplet (76.7M)
//2020-06-22T10:33:20.28+0530 [STG/0] OUT Uploading complete
//2020-06-22T10:33:20.54+0530 [STG/0] OUT Cell e68aeb81-7e99-43e6-adbd-a953e79f8e6c stopping instance af17b6ba-714d-4528-a134-c9887c43cbe2
//2020-06-22T10:33:20.54+0530 [STG/0] OUT Cell e68aeb81-7e99-43e6-adbd-a953e79f8e6c destroying container for instance af17b6ba-714d-4528-a134-c9887c43cbe2
//2020-06-22T10:33:21.15+0530 [CELL/0] OUT Cell e006260b-08b8-44d5-9c8c-06dffbc21935 creating container for instance a73b9ba9-e910-4b5d-7624-dad5
//2020-06-22T10:33:22.42+0530 [CELL/0] OUT Cell e006260b-08b8-44d5-9c8c-06dffbc21935 successfully created container for instance a73b9ba9-e910-4b5d-7624-dad5
//2020-06-22T10:33:22.63+0530 [STG/0] OUT Cell e68aeb81-7e99-43e6-adbd-a953e79f8e6c successfully destroyed container for instance af17b6ba-714d-4528-a134-c9887c43cbe2
//2020-06-22T10:33:22.67+0530 [CELL/0] OUT Downloading droplet...
//2020-06-22T10:33:25.81+0530 [CELL/0] OUT Downloaded droplet (76.7M)
//2020-06-22T10:33:25.81+0530 [CELL/0] OUT Starting health monitoring of container
//2020-06-22T10:33:29.98+0530 [APP/PROC/WEB/0] OUT JVM Memory Configuration: -Xmx428965K -Xss1M -XX:ReservedCodeCacheSize=240M -XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=107610K
//2020-06-22T10:33:35.48+0530 [APP/PROC/WEB/0] OUT  __  __  __     __   ____   ____
//2020-06-22T10:33:35.48+0530 [APP/PROC/WEB/0] OUT  |  \/  | \ \   / /  / ___| |  _ \    ___   _ __ ___     ___
//2020-06-22T10:33:35.48+0530 [APP/PROC/WEB/0] OUT  | |\/| |  \ \ / /  | |     | | | |  / _ \ | '_ ` _ \   / _ \
//2020-06-22T10:33:35.48+0530 [APP/PROC/WEB/0] OUT  | |  | |   \ V /   | |___  | |_| | |  __/ | | | | | | | (_) |
//2020-06-22T10:33:35.48+0530 [APP/PROC/WEB/0] OUT  |_|  |_|    \_/     \____| |____/   \___| |_| |_| |_|  \___/
//2020-06-22T10:33:35.48+0530 [APP/PROC/WEB/0] OUT
//2020-06-22T10:33:37.87+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:03:37.856  INFO 18 --- [           main] pertySourceApplicationContextInitializer : 'cloud' property source added
//2020-06-22T10:33:37.87+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:03:37.878  INFO 18 --- [           main] nfigurationApplicationContextInitializer : Reconfiguration enabled
//2020-06-22T10:33:37.90+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:03:37.901  INFO 18 --- [           main] com.example.MVCDemo                      : Starting MVCDemo on a73b9ba9-e910-4b5d-7624-dad5 with PID 18 (/home/vcap/app/BOOT-INF/classes started by vcap in /home/vcap/app)
//2020-06-22T10:33:37.90+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:03:37.902  INFO 18 --- [           main] com.example.MVCDemo                      : The following profiles are active: cloud
//2020-06-22T10:33:38.78+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:03:38.783  INFO 18 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@3d71d552: startup date [Mon Jun 22 05:03:38 UTC 2020]; root of context hierarchy
//2020-06-22T10:33:41.92+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:03:41.929  INFO 18 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration$$EnhancerBySpringCGLIB$$af128ca8] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
//2020-06-22T10:33:42.36+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:03:42.358  WARN 18 --- [           main] o.h.v.m.ParameterMessageInterpolator     : HV000184: ParameterMessageInterpolator has been chosen, EL interpolation will not be supported
//2020-06-22T10:33:43.56+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:03:43.555  INFO 18 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8080 (http)
//2020-06-22T10:33:43.63+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:03:43.630  INFO 18 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
//2020-06-22T10:33:43.63+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:03:43.636  INFO 18 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.27
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:03:43.996 ERROR 18 --- [cat-startStop-1] org.apache.catalina.core.ContainerBase   : A child container failed during start
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost].TomcatEmbeddedContext[]]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.report(FutureTask.java:122) [na:1.8.0_252]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.get(FutureTask.java:192) [na:1.8.0_252]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:939) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:872) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1419) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1409) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.run(FutureTask.java:266) [na:1.8.0_252]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_252]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_252]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     at java.lang.Thread.run(Thread.java:748) [na:1.8.0_252]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost].TomcatEmbeddedContext[]]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     ... 6 common frames omitted
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [Pipeline[StandardEngine[Tomcat].StandardHost[localhost].TomcatEmbeddedContext[]]]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5117) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     ... 6 common frames omitted
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [org.apache.catalina.authenticator.NonLoginAuthenticator[]]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardPipeline.startInternal(StandardPipeline.java:182) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     ... 8 common frames omitted
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT Caused by: java.lang.NoSuchMethodError: javax.servlet.ServletContext.getVirtualServerName()Ljava/lang/String;
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.authenticator.AuthenticatorBase.startInternal(AuthenticatorBase.java:1194) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.00+0530 [APP/PROC/WEB/0] OUT     ... 10 common frames omitted
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:03:44.011 ERROR 18 --- [           main] org.apache.catalina.core.ContainerBase   : A child container failed during start
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost]]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.report(FutureTask.java:122) ~[na:1.8.0_252]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.get(FutureTask.java:192) ~[na:1.8.0_252]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:939) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:262) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardService.startInternal(StandardService.java:422) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:793) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.startup.Tomcat.start(Tomcat.java:367) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.initialize(TomcatEmbeddedServletContainer.java:99) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.<init>(TomcatEmbeddedServletContainer.java:84) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getTomcatEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:554) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:179) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.createEmbeddedServletContainer(EmbeddedWebApplicationContext.java:164) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:134) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:537) [spring-context-4.3.14.RELEASE.jar!/:4.3.14.RELEASE]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:122) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:693) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:360) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:303) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1118) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1107) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at com.example.MVCDemo.main(MVCDemo.java:10) [classes/:na]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_252]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_252]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_252]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_252]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:48) [app/:na]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:87) [app/:na]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:50) [app/:na]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:51) [app/:na]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost]]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1419) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1409) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.run(FutureTask.java:266) ~[na:1.8.0_252]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) ~[na:1.8.0_252]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) ~[na:1.8.0_252]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at java.lang.Thread.run(Thread.java:748) ~[na:1.8.0_252]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: A child container failed during start
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:948) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:872) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT     ... 6 common frames omitted
//2020-06-22T10:33:44.01+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:03:44.012  WARN 18 --- [           main] ationConfigEmbeddedWebApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.context.ApplicationContextException: Unable to start embedded container; nested exception is org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
//2020-06-22T10:33:44.07+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:03:44.070  INFO 18 --- [           main] utoConfigurationReportLoggingInitializer :
//2020-06-22T10:33:44.07+0530 [APP/PROC/WEB/0] OUT Error starting ApplicationContext. To display the auto-configuration report re-run your application with 'debug' enabled.
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:03:44.094 ERROR 18 --- [           main] o.s.boot.SpringApplication               : Application startup failed
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT org.springframework.context.ApplicationContextException: Unable to start embedded container; nested exception is org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:137) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:537) ~[spring-context-4.3.14.RELEASE.jar!/:4.3.14.RELEASE]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:122) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:693) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:360) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:303) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1118) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1107) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at com.example.MVCDemo.main(MVCDemo.java:10) [classes/:na]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_252]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_252]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_252]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_252]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:48) [app/:na]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:87) [app/:na]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:50) [app/:na]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:51) [app/:na]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT Caused by: org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.initialize(TomcatEmbeddedServletContainer.java:123) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.<init>(TomcatEmbeddedServletContainer.java:84) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getTomcatEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:554) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:179) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.createEmbeddedServletContainer(EmbeddedWebApplicationContext.java:164) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:134) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     ... 16 common frames omitted
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardServer[-1]]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.startup.Tomcat.start(Tomcat.java:367) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.initialize(TomcatEmbeddedServletContainer.java:99) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     ... 21 common frames omitted
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardService[Tomcat]]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:793) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     ... 23 common frames omitted
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat]]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardService.startInternal(StandardService.java:422) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     ... 25 common frames omitted
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: A child container failed during start
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:948) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:262) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:33:44.09+0530 [APP/PROC/WEB/0] OUT     ... 27 common frames omitted
//2020-06-22T10:33:44.22+0530 [APP/PROC/WEB/0] OUT Exit status 1
//2020-06-22T10:33:44.22+0530 [CELL/SSHD/0] OUT Exit status 0
//2020-06-22T10:33:49.83+0530 [CELL/0] OUT Cell e006260b-08b8-44d5-9c8c-06dffbc21935 stopping instance a73b9ba9-e910-4b5d-7624-dad5
//2020-06-22T10:33:49.83+0530 [CELL/0] OUT Cell e006260b-08b8-44d5-9c8c-06dffbc21935 destroying container for instance a73b9ba9-e910-4b5d-7624-dad5
//2020-06-22T10:33:49.84+0530 [API/16] OUT Process has crashed with type: "web"
//2020-06-22T10:33:49.86+0530 [API/16] OUT App instance exited with guid c733dc64-6f3c-4938-b016-76676d2a5c08 payload: {"instance"=>"a73b9ba9-e910-4b5d-7624-dad5", "index"=>0, "cell_id"=>"e006260b-08b8-44d5-9c8c-06dffbc21935", "reason"=>"CRASHED", "exit_description"=>"APP/PROC/WEB: Exited with status 1", "crash_count"=>1, "crash_timestamp"=>1592802229818978895, "version"=>"d0a1087b-7307-4a51-ab6f-2cd1c9d8f4bb"}
//2020-06-22T10:33:50.16+0530 [PROXY/0] OUT Exit status 137
//2020-06-22T10:33:50.19+0530 [CELL/0] OUT Cell 78172535-ad5d-40b4-bfd2-c17819856be2 creating container for instance dd0c2942-8254-4e26-4cd8-49ac
//2020-06-22T10:33:50.64+0530 [CELL/0] OUT Cell e006260b-08b8-44d5-9c8c-06dffbc21935 successfully destroyed container for instance a73b9ba9-e910-4b5d-7624-dad5
//2020-06-22T10:33:51.26+0530 [CELL/0] OUT Cell 78172535-ad5d-40b4-bfd2-c17819856be2 successfully created container for instance dd0c2942-8254-4e26-4cd8-49ac
//2020-06-22T10:33:51.35+0530 [CELL/0] OUT Downloading droplet...
//2020-06-22T10:33:54.77+0530 [CELL/0] OUT Downloaded droplet (76.7M)
//2020-06-22T10:33:54.77+0530 [CELL/0] OUT Starting health monitoring of container
//2020-06-22T10:33:56.32+0530 [APP/PROC/WEB/0] OUT JVM Memory Configuration: -Xmx428965K -Xss1M -XX:ReservedCodeCacheSize=240M -XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=107610K
//2020-06-22T10:33:59.47+0530 [APP/PROC/WEB/0] OUT  __  __  __     __   ____   ____
//2020-06-22T10:33:59.47+0530 [APP/PROC/WEB/0] OUT  |  \/  | \ \   / /  / ___| |  _ \    ___   _ __ ___     ___
//2020-06-22T10:33:59.47+0530 [APP/PROC/WEB/0] OUT  | |\/| |  \ \ / /  | |     | | | |  / _ \ | '_ ` _ \   / _ \
//2020-06-22T10:33:59.47+0530 [APP/PROC/WEB/0] OUT  | |  | |   \ V /   | |___  | |_| | |  __/ | | | | | | | (_) |
//2020-06-22T10:33:59.47+0530 [APP/PROC/WEB/0] OUT  |_|  |_|    \_/     \____| |____/   \___| |_| |_| |_|  \___/
//2020-06-22T10:33:59.47+0530 [APP/PROC/WEB/0] OUT
//2020-06-22T10:34:00.45+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:00.435  INFO 7 --- [           main] pertySourceApplicationContextInitializer : 'cloud' property source added
//2020-06-22T10:34:00.46+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:00.462  INFO 7 --- [           main] nfigurationApplicationContextInitializer : Reconfiguration enabled
//2020-06-22T10:34:00.51+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:00.512  INFO 7 --- [           main] com.example.MVCDemo                      : Starting MVCDemo on dd0c2942-8254-4e26-4cd8-49ac with PID 7 (/home/vcap/app/BOOT-INF/classes started by vcap in /home/vcap/app)
//2020-06-22T10:34:00.51+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:00.512  INFO 7 --- [           main] com.example.MVCDemo                      : The following profiles are active: cloud
//2020-06-22T10:34:02.02+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:02.022  INFO 7 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@3d71d552: startup date [Mon Jun 22 05:04:02 UTC 2020]; root of context hierarchy
//2020-06-22T10:34:06.32+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:06.322  INFO 7 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration$$EnhancerBySpringCGLIB$$af128ca8] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
//2020-06-22T10:34:06.55+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:06.556  WARN 7 --- [           main] o.h.v.m.ParameterMessageInterpolator     : HV000184: ParameterMessageInterpolator has been chosen, EL interpolation will not be supported
//2020-06-22T10:34:07.34+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:07.342  INFO 7 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8080 (http)
//2020-06-22T10:34:07.37+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:07.378  INFO 7 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
//2020-06-22T10:34:07.38+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:07.385  INFO 7 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.27
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:07.633 ERROR 7 --- [cat-startStop-1] org.apache.catalina.core.ContainerBase   : A child container failed during start
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost].TomcatEmbeddedContext[]]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.report(FutureTask.java:122) [na:1.8.0_252]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.get(FutureTask.java:192) [na:1.8.0_252]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:939) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:872) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1419) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1409) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.run(FutureTask.java:266) [na:1.8.0_252]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_252]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_252]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     at java.lang.Thread.run(Thread.java:748) [na:1.8.0_252]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost].TomcatEmbeddedContext[]]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     ... 6 common frames omitted
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [Pipeline[StandardEngine[Tomcat].StandardHost[localhost].TomcatEmbeddedContext[]]]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5117) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     ... 6 common frames omitted
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [org.apache.catalina.authenticator.NonLoginAuthenticator[]]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardPipeline.startInternal(StandardPipeline.java:182) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     ... 8 common frames omitted
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT Caused by: java.lang.NoSuchMethodError: javax.servlet.ServletContext.getVirtualServerName()Ljava/lang/String;
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.authenticator.AuthenticatorBase.startInternal(AuthenticatorBase.java:1194) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.63+0530 [APP/PROC/WEB/0] OUT     ... 10 common frames omitted
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:07.665 ERROR 7 --- [           main] org.apache.catalina.core.ContainerBase   : A child container failed during start
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost]]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.report(FutureTask.java:122) ~[na:1.8.0_252]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.get(FutureTask.java:192) ~[na:1.8.0_252]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:939) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:262) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardService.startInternal(StandardService.java:422) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:793) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.startup.Tomcat.start(Tomcat.java:367) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.initialize(TomcatEmbeddedServletContainer.java:99) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.<init>(TomcatEmbeddedServletContainer.java:84) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getTomcatEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:554) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:179) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.createEmbeddedServletContainer(EmbeddedWebApplicationContext.java:164) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:134) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:537) [spring-context-4.3.14.RELEASE.jar!/:4.3.14.RELEASE]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:122) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:693) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:360) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:303) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1118) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1107) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at com.example.MVCDemo.main(MVCDemo.java:10) [classes/:na]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_252]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_252]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_252]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_252]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:48) [app/:na]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:87) [app/:na]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:50) [app/:na]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:51) [app/:na]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost]]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1419) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1409) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.run(FutureTask.java:266) ~[na:1.8.0_252]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) ~[na:1.8.0_252]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) ~[na:1.8.0_252]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at java.lang.Thread.run(Thread.java:748) ~[na:1.8.0_252]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: A child container failed during start
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:948) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:872) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT     ... 6 common frames omitted
//2020-06-22T10:34:07.66+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:07.666  WARN 7 --- [           main] ationConfigEmbeddedWebApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.context.ApplicationContextException: Unable to start embedded container; nested exception is org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
//2020-06-22T10:34:07.68+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:07.689  INFO 7 --- [           main] utoConfigurationReportLoggingInitializer :
//2020-06-22T10:34:07.68+0530 [APP/PROC/WEB/0] OUT Error starting ApplicationContext. To display the auto-configuration report re-run your application with 'debug' enabled.
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:07.700 ERROR 7 --- [           main] o.s.boot.SpringApplication               : Application startup failed
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT org.springframework.context.ApplicationContextException: Unable to start embedded container; nested exception is org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:137) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:537) ~[spring-context-4.3.14.RELEASE.jar!/:4.3.14.RELEASE]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:122) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:693) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:360) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:303) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1118) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1107) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at com.example.MVCDemo.main(MVCDemo.java:10) [classes/:na]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_252]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_252]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_252]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_252]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:48) [app/:na]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:87) [app/:na]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:50) [app/:na]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:51) [app/:na]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT Caused by: org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.initialize(TomcatEmbeddedServletContainer.java:123) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.<init>(TomcatEmbeddedServletContainer.java:84) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getTomcatEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:554) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:179) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.createEmbeddedServletContainer(EmbeddedWebApplicationContext.java:164) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:134) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     ... 16 common frames omitted
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardServer[-1]]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.startup.Tomcat.start(Tomcat.java:367) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.initialize(TomcatEmbeddedServletContainer.java:99) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     ... 21 common frames omitted
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardService[Tomcat]]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:793) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     ... 23 common frames omitted
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat]]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardService.startInternal(StandardService.java:422) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     ... 25 common frames omitted
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: A child container failed during start
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:948) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:262) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:07.70+0530 [APP/PROC/WEB/0] OUT     ... 27 common frames omitted
//2020-06-22T10:34:07.82+0530 [APP/PROC/WEB/0] OUT Exit status 1
//2020-06-22T10:34:07.82+0530 [CELL/SSHD/0] OUT Exit status 0
//2020-06-22T10:34:13.38+0530 [CELL/0] OUT Cell 78172535-ad5d-40b4-bfd2-c17819856be2 stopping instance dd0c2942-8254-4e26-4cd8-49ac
//2020-06-22T10:34:13.38+0530 [CELL/0] OUT Cell 78172535-ad5d-40b4-bfd2-c17819856be2 destroying container for instance dd0c2942-8254-4e26-4cd8-49ac
//2020-06-22T10:34:13.38+0530 [API/7] OUT Process has crashed with type: "web"
//2020-06-22T10:34:13.40+0530 [API/7] OUT App instance exited with guid c733dc64-6f3c-4938-b016-76676d2a5c08 payload: {"instance"=>"dd0c2942-8254-4e26-4cd8-49ac", "index"=>0, "cell_id"=>"78172535-ad5d-40b4-bfd2-c17819856be2", "reason"=>"CRASHED", "exit_description"=>"APP/PROC/WEB: Exited with status 1", "crash_count"=>2, "crash_timestamp"=>1592802253356331877, "version"=>"d0a1087b-7307-4a51-ab6f-2cd1c9d8f4bb"}
//2020-06-22T10:34:13.60+0530 [PROXY/0] OUT Exit status 137
//2020-06-22T10:34:13.70+0530 [CELL/0] OUT Cell 1a0560af-7184-4318-a4a2-e908fb6f5662 creating container for instance 41f31b78-eea1-4c05-781d-d68a
//2020-06-22T10:34:13.89+0530 [CELL/0] OUT Cell 78172535-ad5d-40b4-bfd2-c17819856be2 successfully destroyed container for instance dd0c2942-8254-4e26-4cd8-49ac
//2020-06-22T10:34:14.56+0530 [CELL/0] OUT Cell 1a0560af-7184-4318-a4a2-e908fb6f5662 successfully created container for instance 41f31b78-eea1-4c05-781d-d68a
//2020-06-22T10:34:15.36+0530 [CELL/0] OUT Downloading droplet...
//2020-06-22T10:34:19.08+0530 [CELL/0] OUT Downloaded droplet (76.7M)
//2020-06-22T10:34:19.08+0530 [CELL/0] OUT Starting health monitoring of container
//2020-06-22T10:34:20.77+0530 [APP/PROC/WEB/0] OUT JVM Memory Configuration: -Xmx428965K -Xss1M -XX:ReservedCodeCacheSize=240M -XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=107610K
//2020-06-22T10:34:22.87+0530 [APP/PROC/WEB/0] OUT  __  __  __     __   ____   ____
//2020-06-22T10:34:22.87+0530 [APP/PROC/WEB/0] OUT  |  \/  | \ \   / /  / ___| |  _ \    ___   _ __ ___     ___
//2020-06-22T10:34:22.87+0530 [APP/PROC/WEB/0] OUT  | |\/| |  \ \ / /  | |     | | | |  / _ \ | '_ ` _ \   / _ \
//2020-06-22T10:34:22.88+0530 [APP/PROC/WEB/0] OUT  | |  | |   \ V /   | |___  | |_| | |  __/ | | | | | | | (_) |
//2020-06-22T10:34:22.88+0530 [APP/PROC/WEB/0] OUT  |_|  |_|    \_/     \____| |____/   \___| |_| |_| |_|  \___/
//2020-06-22T10:34:22.88+0530 [APP/PROC/WEB/0] OUT
//2020-06-22T10:34:23.23+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:23.226  INFO 31 --- [           main] pertySourceApplicationContextInitializer : 'cloud' property source added
//2020-06-22T10:34:23.23+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:23.238  INFO 31 --- [           main] nfigurationApplicationContextInitializer : Reconfiguration enabled
//2020-06-22T10:34:23.25+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:23.258  INFO 31 --- [           main] com.example.MVCDemo                      : Starting MVCDemo on 41f31b78-eea1-4c05-781d-d68a with PID 31 (/home/vcap/app/BOOT-INF/classes started by vcap in /home/vcap/app)
//2020-06-22T10:34:23.25+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:23.258  INFO 31 --- [           main] com.example.MVCDemo                      : The following profiles are active: cloud
//2020-06-22T10:34:23.83+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:23.837  INFO 31 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@1cf4f579: startup date [Mon Jun 22 05:04:23 UTC 2020]; root of context hierarchy
//2020-06-22T10:34:25.59+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:25.592  INFO 31 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration$$EnhancerBySpringCGLIB$$af128ca8] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
//2020-06-22T10:34:25.83+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:25.835  WARN 31 --- [           main] o.h.v.m.ParameterMessageInterpolator     : HV000184: ParameterMessageInterpolator has been chosen, EL interpolation will not be supported
//2020-06-22T10:34:26.35+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:26.351  INFO 31 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8080 (http)
//2020-06-22T10:34:26.38+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:26.380  INFO 31 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
//2020-06-22T10:34:26.38+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:26.382  INFO 31 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.27
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:26.530 ERROR 31 --- [cat-startStop-1] org.apache.catalina.core.ContainerBase   : A child container failed during start
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost].TomcatEmbeddedContext[]]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.report(FutureTask.java:122) [na:1.8.0_252]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.get(FutureTask.java:192) [na:1.8.0_252]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:939) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:872) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1419) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1409) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.run(FutureTask.java:266) [na:1.8.0_252]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_252]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_252]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at java.lang.Thread.run(Thread.java:748) [na:1.8.0_252]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost].TomcatEmbeddedContext[]]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     ... 6 common frames omitted
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [Pipeline[StandardEngine[Tomcat].StandardHost[localhost].TomcatEmbeddedContext[]]]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5117) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     ... 6 common frames omitted
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [org.apache.catalina.authenticator.NonLoginAuthenticator[]]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardPipeline.startInternal(StandardPipeline.java:182) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     ... 8 common frames omitted
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT Caused by: java.lang.NoSuchMethodError: javax.servlet.ServletContext.getVirtualServerName()Ljava/lang/String;
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.authenticator.AuthenticatorBase.startInternal(AuthenticatorBase.java:1194) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     ... 10 common frames omitted
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:26.535 ERROR 31 --- [           main] org.apache.catalina.core.ContainerBase   : A child container failed during start
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost]]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.report(FutureTask.java:122) ~[na:1.8.0_252]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.get(FutureTask.java:192) ~[na:1.8.0_252]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:939) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:262) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardService.startInternal(StandardService.java:422) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:793) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.startup.Tomcat.start(Tomcat.java:367) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.initialize(TomcatEmbeddedServletContainer.java:99) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.<init>(TomcatEmbeddedServletContainer.java:84) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getTomcatEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:554) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:179) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.createEmbeddedServletContainer(EmbeddedWebApplicationContext.java:164) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:134) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:537) [spring-context-4.3.14.RELEASE.jar!/:4.3.14.RELEASE]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:122) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:693) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:360) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:303) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1118) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1107) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at com.example.MVCDemo.main(MVCDemo.java:10) [classes/:na]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_252]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_252]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_252]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_252]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:48) [app/:na]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:87) [app/:na]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:50) [app/:na]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:51) [app/:na]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost]]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1419) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1409) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.run(FutureTask.java:266) ~[na:1.8.0_252]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) ~[na:1.8.0_252]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) ~[na:1.8.0_252]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at java.lang.Thread.run(Thread.java:748) ~[na:1.8.0_252]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: A child container failed during start
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:948) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:872) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT     ... 6 common frames omitted
//2020-06-22T10:34:26.53+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:26.536  WARN 31 --- [           main] ationConfigEmbeddedWebApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.context.ApplicationContextException: Unable to start embedded container; nested exception is org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
//2020-06-22T10:34:26.55+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:26.556  INFO 31 --- [           main] utoConfigurationReportLoggingInitializer :
//2020-06-22T10:34:26.55+0530 [APP/PROC/WEB/0] OUT Error starting ApplicationContext. To display the auto-configuration report re-run your application with 'debug' enabled.
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:04:26.566 ERROR 31 --- [           main] o.s.boot.SpringApplication               : Application startup failed
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT org.springframework.context.ApplicationContextException: Unable to start embedded container; nested exception is org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:137) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:537) ~[spring-context-4.3.14.RELEASE.jar!/:4.3.14.RELEASE]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:122) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:693) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:360) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:303) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1118) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1107) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at com.example.MVCDemo.main(MVCDemo.java:10) [classes/:na]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_252]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_252]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_252]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_252]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:48) [app/:na]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:87) [app/:na]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:50) [app/:na]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:51) [app/:na]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT Caused by: org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.initialize(TomcatEmbeddedServletContainer.java:123) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.<init>(TomcatEmbeddedServletContainer.java:84) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getTomcatEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:554) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:179) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.createEmbeddedServletContainer(EmbeddedWebApplicationContext.java:164) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:134) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     ... 16 common frames omitted
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardServer[-1]]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.startup.Tomcat.start(Tomcat.java:367) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.initialize(TomcatEmbeddedServletContainer.java:99) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     ... 21 common frames omitted
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardService[Tomcat]]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:793) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     ... 23 common frames omitted
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat]]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardService.startInternal(StandardService.java:422) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     ... 25 common frames omitted
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: A child container failed during start
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:948) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:262) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:34:26.56+0530 [APP/PROC/WEB/0] OUT     ... 27 common frames omitted
//2020-06-22T10:34:26.65+0530 [APP/PROC/WEB/0] OUT Exit status 1
//2020-06-22T10:34:26.66+0530 [CELL/SSHD/0] OUT Exit status 0
//2020-06-22T10:34:32.09+0530 [CELL/0] OUT Cell 1a0560af-7184-4318-a4a2-e908fb6f5662 stopping instance 41f31b78-eea1-4c05-781d-d68a
//2020-06-22T10:34:32.09+0530 [CELL/0] OUT Cell 1a0560af-7184-4318-a4a2-e908fb6f5662 destroying container for instance 41f31b78-eea1-4c05-781d-d68a
//2020-06-22T10:34:32.11+0530 [API/17] OUT Process has crashed with type: "web"
//2020-06-22T10:34:32.12+0530 [API/17] OUT App instance exited with guid c733dc64-6f3c-4938-b016-76676d2a5c08 payload: {"instance"=>"41f31b78-eea1-4c05-781d-d68a", "index"=>0, "cell_id"=>"1a0560af-7184-4318-a4a2-e908fb6f5662", "reason"=>"CRASHED", "exit_description"=>"APP/PROC/WEB: Exited with status 1", "crash_count"=>3, "crash_timestamp"=>1592802272087697816, "version"=>"d0a1087b-7307-4a51-ab6f-2cd1c9d8f4bb"}
//2020-06-22T10:34:32.33+0530 [PROXY/0] OUT Exit status 137
//2020-06-22T10:34:32.74+0530 [CELL/0] OUT Cell 1a0560af-7184-4318-a4a2-e908fb6f5662 successfully destroyed container for instance 41f31b78-eea1-4c05-781d-d68a
//2020-06-22T10:35:06.42+0530 [CELL/0] OUT Cell 4ae961ca-0fe4-4c10-acc6-cffcd81c918a creating container for instance 45b9c3ca-e91a-4b8f-56eb-b7c0
//2020-06-22T10:35:08.45+0530 [CELL/0] OUT Cell 4ae961ca-0fe4-4c10-acc6-cffcd81c918a successfully created container for instance 45b9c3ca-e91a-4b8f-56eb-b7c0
//2020-06-22T10:35:08.87+0530 [CELL/0] OUT Downloading droplet...
//2020-06-22T10:35:13.19+0530 [CELL/0] OUT Downloaded droplet (76.7M)
//2020-06-22T10:35:13.19+0530 [CELL/0] OUT Starting health monitoring of container
//2020-06-22T10:35:15.92+0530 [APP/PROC/WEB/0] OUT JVM Memory Configuration: -Xmx428965K -Xss1M -XX:ReservedCodeCacheSize=240M -XX:MaxDirectMemorySize=10M -XX:MaxMetaspaceSize=107610K
//2020-06-22T10:35:27.61+0530 [APP/PROC/WEB/0] OUT  __  __  __     __   ____   ____
//2020-06-22T10:35:27.61+0530 [APP/PROC/WEB/0] OUT  |  \/  | \ \   / /  / ___| |  _ \    ___   _ __ ___     ___
//2020-06-22T10:35:27.61+0530 [APP/PROC/WEB/0] OUT  | |\/| |  \ \ / /  | |     | | | |  / _ \ | '_ ` _ \   / _ \
//2020-06-22T10:35:27.61+0530 [APP/PROC/WEB/0] OUT  | |  | |   \ V /   | |___  | |_| | |  __/ | | | | | | | (_) |
//2020-06-22T10:35:27.61+0530 [APP/PROC/WEB/0] OUT  |_|  |_|    \_/     \____| |____/   \___| |_| |_| |_|  \___/
//2020-06-22T10:35:27.64+0530 [APP/PROC/WEB/0] OUT
//2020-06-22T10:35:29.53+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:05:29.484  INFO 14 --- [           main] pertySourceApplicationContextInitializer : 'cloud' property source added
//2020-06-22T10:35:29.54+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:05:29.548  INFO 14 --- [           main] nfigurationApplicationContextInitializer : Reconfiguration enabled
//2020-06-22T10:35:29.62+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:05:29.625  INFO 14 --- [           main] com.example.MVCDemo                      : Starting MVCDemo on 45b9c3ca-e91a-4b8f-56eb-b7c0 with PID 14 (/home/vcap/app/BOOT-INF/classes started by vcap in /home/vcap/app)
//2020-06-22T10:35:29.62+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:05:29.627  INFO 14 --- [           main] com.example.MVCDemo                      : The following profiles are active: cloud
//2020-06-22T10:35:32.09+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:05:32.090  INFO 14 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@3d71d552: startup date [Mon Jun 22 05:05:32 UTC 2020]; root of context hierarchy
//2020-06-22T10:35:44.78+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:05:44.783  INFO 14 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration$$EnhancerBySpringCGLIB$$af128ca8] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
//2020-06-22T10:35:45.51+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:05:45.504  WARN 14 --- [           main] o.h.v.m.ParameterMessageInterpolator     : HV000184: ParameterMessageInterpolator has been chosen, EL interpolation will not be supported
//2020-06-22T10:35:49.94+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:05:49.945  INFO 14 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8080 (http)
//2020-06-22T10:35:50.35+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:05:50.349  INFO 14 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
//2020-06-22T10:35:50.37+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:05:50.376  INFO 14 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.27
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:05:51.640 ERROR 14 --- [cat-startStop-1] org.apache.catalina.core.ContainerBase   : A child container failed during start
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost].TomcatEmbeddedContext[]]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.report(FutureTask.java:122) [na:1.8.0_252]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.get(FutureTask.java:192) [na:1.8.0_252]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:939) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:872) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1419) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1409) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.run(FutureTask.java:266) [na:1.8.0_252]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_252]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_252]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at java.lang.Thread.run(Thread.java:748) [na:1.8.0_252]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost].TomcatEmbeddedContext[]]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     ... 6 common frames omitted
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [Pipeline[StandardEngine[Tomcat].StandardHost[localhost].TomcatEmbeddedContext[]]]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5117) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     ... 6 common frames omitted
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [org.apache.catalina.authenticator.NonLoginAuthenticator[]]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardPipeline.startInternal(StandardPipeline.java:182) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     ... 8 common frames omitted
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT Caused by: java.lang.NoSuchMethodError: javax.servlet.ServletContext.getVirtualServerName()Ljava/lang/String;
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.authenticator.AuthenticatorBase.startInternal(AuthenticatorBase.java:1194) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     ... 10 common frames omitted
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:05:51.649 ERROR 14 --- [           main] org.apache.catalina.core.ContainerBase   : A child container failed during start
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT java.util.concurrent.ExecutionException: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost]]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.report(FutureTask.java:122) ~[na:1.8.0_252]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.get(FutureTask.java:192) ~[na:1.8.0_252]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:939) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:262) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardService.startInternal(StandardService.java:422) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:793) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.64+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.startup.Tomcat.start(Tomcat.java:367) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.initialize(TomcatEmbeddedServletContainer.java:99) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.<init>(TomcatEmbeddedServletContainer.java:84) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getTomcatEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:554) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:179) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.createEmbeddedServletContainer(EmbeddedWebApplicationContext.java:164) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:134) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:537) [spring-context-4.3.14.RELEASE.jar!/:4.3.14.RELEASE]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:122) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:693) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:360) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:303) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1118) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1107) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at com.example.MVCDemo.main(MVCDemo.java:10) [classes/:na]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_252]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_252]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_252]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_252]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:48) [app/:na]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:87) [app/:na]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:50) [app/:na]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:51) [app/:na]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat].StandardHost[localhost]]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1419) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1409) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.FutureTask.run(FutureTask.java:266) ~[na:1.8.0_252]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) ~[na:1.8.0_252]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) ~[na:1.8.0_252]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at java.lang.Thread.run(Thread.java:748) ~[na:1.8.0_252]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: A child container failed during start
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:948) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:872) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) [tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT     ... 6 common frames omitted
//2020-06-22T10:35:51.65+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:05:51.650  WARN 14 --- [           main] ationConfigEmbeddedWebApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.context.ApplicationContextException: Unable to start embedded container; nested exception is org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
//2020-06-22T10:35:51.75+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:05:51.754  INFO 14 --- [           main] utoConfigurationReportLoggingInitializer :
//2020-06-22T10:35:51.75+0530 [APP/PROC/WEB/0] OUT Error starting ApplicationContext. To display the auto-configuration report re-run your application with 'debug' enabled.
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT 2020-06-22 05:05:51.770 ERROR 14 --- [           main] o.s.boot.SpringApplication               : Application startup failed
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT org.springframework.context.ApplicationContextException: Unable to start embedded container; nested exception is org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:137) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:537) ~[spring-context-4.3.14.RELEASE.jar!/:4.3.14.RELEASE]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:122) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:693) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:360) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:303) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1118) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.SpringApplication.run(SpringApplication.java:1107) [spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at com.example.MVCDemo.main(MVCDemo.java:10) [classes/:na]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_252]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_252]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_252]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_252]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:48) [app/:na]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:87) [app/:na]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.Launcher.launch(Launcher.java:50) [app/:na]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:51) [app/:na]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT Caused by: org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.initialize(TomcatEmbeddedServletContainer.java:123) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.<init>(TomcatEmbeddedServletContainer.java:84) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getTomcatEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:554) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:179) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.createEmbeddedServletContainer(EmbeddedWebApplicationContext.java:164) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:134) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     ... 16 common frames omitted
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardServer[-1]]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.startup.Tomcat.start(Tomcat.java:367) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.initialize(TomcatEmbeddedServletContainer.java:99) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     ... 21 common frames omitted
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardService[Tomcat]]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:793) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     ... 23 common frames omitted
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Tomcat]]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:167) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardService.startInternal(StandardService.java:422) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     ... 25 common frames omitted
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT Caused by: org.apache.catalina.LifecycleException: A child container failed during start
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:948) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:262) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150) ~[tomcat-embed-core-8.5.27.jar!/:8.5.27]
//2020-06-22T10:35:51.77+0530 [APP/PROC/WEB/0] OUT     ... 27 common frames omitted
//2020-06-22T10:35:52.23+0530 [APP/PROC/WEB/0] OUT Exit status 1
//2020-06-22T10:35:52.23+0530 [CELL/SSHD/0] OUT Exit status 0
//2020-06-22T10:35:58.11+0530 [CELL/0] OUT Cell 4ae961ca-0fe4-4c10-acc6-cffcd81c918a stopping instance 45b9c3ca-e91a-4b8f-56eb-b7c0
//2020-06-22T10:35:58.11+0530 [CELL/0] OUT Cell 4ae961ca-0fe4-4c10-acc6-cffcd81c918a destroying container for instance 45b9c3ca-e91a-4b8f-56eb-b7c0
//2020-06-22T10:35:58.12+0530 [API/16] OUT Process has crashed with type: "web"
//2020-06-22T10:35:58.14+0530 [API/16] OUT App instance exited with guid c733dc64-6f3c-4938-b016-76676d2a5c08 payload: {"instance"=>"45b9c3ca-e91a-4b8f-56eb-b7c0", "index"=>0, "cell_id"=>"4ae961ca-0fe4-4c10-acc6-cffcd81c918a", "reason"=>"CRASHED", "exit_description"=>"APP/PROC/WEB: Exited with status 1", "crash_count"=>4, "crash_timestamp"=>1592802358104923029, "version"=>"d0a1087b-7307-4a51-ab6f-2cd1c9d8f4bb"}



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    Long rollNumber;
    String studentName;
    int Standard;
    String Divison;
    String DOB;
    String Email;
    String Gender;
    String City;
    String pinCode;
    String Contact;
    
	@Override
	public String toString() {
		return "\nStudent [rollNumber=" + rollNumber + ", studentName=" + studentName + ", Standard=" + Standard
				+ ", Divison=" + Divison + ", DOB=" + DOB + ", City=" + City + ", Email=" + Email + ", Gender=" + Gender
				+ ", pinCode=" + pinCode + ", Contact=" + Contact + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Long rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStandard() {
		return Standard;
	}
	public void setStandard(int standard) {
		Standard = standard;
	}
	public String getDivison() {
		return Divison;
	}
	public void setDivison(String divison) {
		Divison = divison;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}	
}
