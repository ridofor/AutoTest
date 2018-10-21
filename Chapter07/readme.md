1.下载moco的jar包
https://repo1.maven.org/maven2/com/github/dreamhead/moco-runner/0.11.0
选择最大的一个文件进行下载

2.启动moco
java -jar ./moco-runner-0.11.0-standalone.jar http -p 8022 -c json文件

3.下载jmeter
网址：http://jmeter.apache.org/download_jmeter.cgi
进入bin目录：sh jmeter启动
改成中文：bin目录下面有一个jmeter.properties，在文件中添加language=zh_CN

4.带参数的get／post请求
1）新建startup.json
2) 编写文件,三要素：描述／request（uri+method+参数（get的queries／post的forms／post的json）+cookies+header等等）／response
3）启动：java -jar ./moco-runner-0.11.0-standalone.jar http -p 8022 -c startup.json
4）启动jmeter：
   JMeter基础操作：
   1，点击测试计划 -- 添加 -- Threads(users) -- 线程组
   2，点击线程组 -- 添加 -- sampler -http请求
   3，填写参数
   4，查看结果：线程组 -- 添加 -- 监听器 -- 查看结果树 --点击启动按钮

5.带cookies的get／post请求
在之前的基础上，jmeter中添加设置cookie步骤：线程组-配置元件-http cookie 管理器。添加以后，在名称，值，路径，域加上值再运行。

6.带headers信息的mock请求
tips：
1）带有headers的请求在jmeter运行，要在配置元件里面添加“http信息头管理器”，在里面填写参数，比如上面的json文件，参数就是“content-type”，“application/json”,
2）如果头部有json文件，记得在body data里面也要添加!
3）post请求里没有queries这个字段，只有get请求才有！