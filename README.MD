Spring基于xml的ioc 环境与入门

导入pom.xml

```bash
    <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>5.0.2.RELEASE</version>
        </dependency>
    </dependencies>

```
![在这里插入图片描述](https://img-blog.csdnimg.cn/2020050723591478.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM2MzQ0Nzcx,size_16,color_FFFFFF,t_70)

**创建bean.xml**
创建一个bean.xml文件，然后导入约束

```bash
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">
</beans>
```

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200508000433783.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM2MzQ0Nzcx,size_16,color_FFFFFF,t_70)


**ApplicationContext三个实现类**

ClassPathXmlApplicationContext 可以加载类路径下的配置文件，要求配置文件必须在类路径下，不在的话，加载不了（更常用）
FileSystemXmlApplicationContext 加载磁盘任意路径下的配置文件，必须有访问权限
AnotationConfigApplicationContext 读取注解创建容器


**BeanFactory和ApplicationContext的区别**

> ApplicationContext:

它在构建核心容器的时候，创建对象采用立即加载的方式，也就是说，只要读取完配置文件就马上创建配置文件中的对象

我们在AccountServiceImpl添加构造函数

```bash
public AccountServiceImpl() {
    System.out.println("对象创建了");
}
```
再次运行
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200508110928157.png)
读取完配置文件就创建了对象。

> BeanFactory

采用延迟加载的方式，什么时候根据id获取对象，什么时候才真正的创建对象。


问题还有，我们之所以能运行saveAccount，是因为在AccountService中的AccountDao的对象我们手动new了出来

所以本项目只是大体了讲解了Spring的入门