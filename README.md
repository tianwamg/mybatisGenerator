# mybatisGenerator
# mybatis代码生成工具
</br>
use InterlliJ IDEA describe how to use it:</br>
  1.open it in idea.</br>
  2.click Project Structure->Libraries.</br>
  3.click green button add java ,choose lib ,click ok.</br>
  4.configure database in file generatorConfig.xml,include driverClass,connectionURL,userId,password.after it write your table name.</br>
  5.run file GneratorSqlmap in src.</br>
Project structure description:</br>
  lib: run this project need jars lib.</br>
  generatorConfig.xml: config your database information.</br>
  src: </br>
  comment: generate chinese comment in pojo.</br>
  GeneratorSqlmap: run this project and output the files you need. </br>
</br>for more detail please see my [blog](http://www.cnblog.com/tianwamg/p/10662804.html)
  
</br></br>在InterlliJ IDEA下使用描述：</br>
  1.在idea内打开。</br>
  2.点击 Project Structure->Libraries ，点击绿色添加按钮，选择java，找到lib目录，选择ok即可。</br>
  3.配置generatorConfig.xml文件，包括驱动，数据库，账号，密码；输入表名即可。</br>
  4.运行GeneratorSqlmap java文件。</br>
项目结构描述:</br>
  lib:项目运行需要的jar包。</br>
  generatorConfigmap.xml:配置数据库相关信息。</br>
  src：</br>
  comment：pojo类生成中文注释。</br>
  GeneratorSqlmap:运行该项目。</br>

</br>详细请查看[博客](http://www.cnblog.com/tianwamg/p/10662804.html)
  
  
