# Springboot + Dubbo搭建微服务的入门文档
   * 本项目分为三个模块，dubbo-api是公用的接口和模型，供其他模块依赖。
   *  provider 是生产者，consumer是消费者，这两个都是基于spring-boot搭建的项目
   *  本项目中所需要安装的文件，在当前项目的file目录下

# 安装、启动步骤
*  安装好zookeeper并启动
*  启动provider
*  启动consumer


# 所需软件
* maven3   :
    * http://maven.apache.org/download.cgi
    * http://apache.website-solution.net/maven/maven-3/3.6.1/binaries/apache-maven-3.6.1-bin.tar.gz

* tomcat8  :
    * https://tomcat.apache.org/download-80.cgi
    * http://apache.communilink.net/tomcat/tomcat-8/v8.5.40/bin/apache-tomcat-8.5.40-windows-x64.zip

* JDK8     :
    * https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

* zookeeper3:
    * https://www.apache.org/dyn/closer.cgi/zookeeper/
    * https://archive.apache.org/dist/zookeeper/zookeeper-3.4.14/zookeeper-3.4.14.tar.gz

* dubboAdmin2.5.4
    * https://github.com/apache/incubator-dubbo-admin
    * 链接: https://pan.baidu.com/s/1MWqWPPy2AkuOQ6dXtzM6uQ 提取码: 56cd 复制这段内容后打开百度网盘手机App，操作更方便哦

# 参考文档

基于SpringBoot2.0.x+Dubbo2.6.x+zookeeper3.4.1x创建RPC服务解析
https://www.2cto.com/kf/201809/778366.html

搭建一个简单的springboot+dubbo服务
https://www.jianshu.com/p/1922a748fb71

dubbo-admin安装和使用
https://www.cnblogs.com/shengulong/p/8303454.html

dubbo-admin地址
https://github.com/apache/incubator-dubbo-admin

其他官方文档：
https://dubbo.apache.org/zh-cn/docs/admin/install/zookeeper.html
