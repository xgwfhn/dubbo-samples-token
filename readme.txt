
token 为了防止客户端直连服务端 跳过注册中心  但客户端不是直连的情况下  即便是服务端设置token  客户端也能正常调用
dubbo token: token-provider.xml  token-consumer.xml TokenConsumer.java TokenProvider.java

以jar包的形式部署
	拷贝target中项目的jar包及lib 放置到服务器的同一目录下  如果需要添加或删除项目的jar  可以在项目中的jar包的META-INF/MANIFEST.MF 修改
	运行命令   cmd进入jar所在位置   执行  java -jar xxx.jar