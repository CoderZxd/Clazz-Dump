# Clazz-Dump
java agent 导出指定package目录下的class文件


#### 在vm参数中，加入该agent
>-javaagent:D:\Class-dump.jar=-d=D:/f/;-p=com/alibaba/dubbo;-r
>>-d:导出文件目录根目录
>>-p:导出过滤表达式，此处为类名前缀
>>-r:是否创建多级目录
