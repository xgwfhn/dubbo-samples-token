
token 为了防止客户端直连服务端 跳过注册中心  但客户端不是直连的情况下  即便是服务端设置token  客户端也能正常调用
dubbo token: token-provider.xml  token-consumer.xml TokenConsumer.java TokenProvider.java