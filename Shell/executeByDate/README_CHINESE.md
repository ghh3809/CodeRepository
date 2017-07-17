##简介
按日期执行的Shell脚本的模板。

##使用说明
1. 将文件中`Your code here`部分替换为自己的代码。
2. 使用变量`executeDate`作为当前执行日期。
3. 执行命令`sh executeByDate 开始日期 结束日期 (步长)`。如果`开始日期`比`结束日期`更晚，则程序将按日期逐渐变早的顺序执行。`步长`表示要执行日期的步长，在没有输入时，`步长`默认为1。 

##输出
示例输出如下：

> \**********************
> 
> Execute date: 20170608
> 
> \**********************
> 
> ##########你的输出##########
> 
> \****************************************
> 
> Date 20170608 has already been executed.
> 
> \****************************************
> 
> ...