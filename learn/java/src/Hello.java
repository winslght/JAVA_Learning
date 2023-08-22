//java开始学习！！！
/*
    1.public class hello 表示hello是一个类，是一个public的类
    2.Hello{}表示一个类的开始个结束
    3.public static void main(String[] args) 表示一个主方法，即我们程序的入口'S'是大写
    4.main(){}表示方法的开始
    5.System.out.println("Hello world~");表四输出hello world到屏幕上
    6.;表示语句的结束
    7.class是一个类，一个程序可以有好几个类，但是public只能有一个,class后边的类首字母必须大写
    8.每一个class编译之后每一个类都会生成对应的class文件，可以有空的类
*/   //多行注释不能嵌套使用

/**
 * @author winslght             //这个叫文档标签,可以生成对应的文档注释
 * @version 1.0                 //在源代码目录下cmd用javadoc命令来生成对应的文档注释,例如下面这行命令
 */                             //javadoc -d d:\\Java_Doc -author -version Hello.java
                                //javadoc -d 文件夹目录 -xx -yy 文件名字.java   (格式)
public class Hello//这个public类叫Hello，则这个文件的名称就叫Hello，一改就报错
{
    public static void main(String[]args)
        {
            System.out.println("Hello world!");
        }
}



class Dog//一个源文件的public类只能有一个，其他的类个数不限，可以有空的类
{
    public static void main(String[]args)//main方法也可以写在非public类里面，然后可以指定运行非public类
                                        //这是运行非public类的方法
    {
        System.out.println("Hello,小狗狗");
    }
}



class ZhuanYiFu  //转义符
{
    public static void main(String[]args)
//转义字符的使用
//JAVA常用的转义字符有:(转义就是转换字符的意义，不产生歧义)
    {   //   \t  一个制表位，实现对齐的功能
        System.out.println("little\tcat");
        //   \n  换行符
        System.out.println("little\ncat");   //cmd控制台按Tab可以实现命令补全
        //   \"  一个"符号
        System.out.println("老王说：“好样的”");//这是中文的引号，不用转译就能直接用
        System.out.println("老王说：\"好样的\"");
        //   \\  一个\符号
        System.out.println("little\\cat");
        //   \'  一个'符号       (额,'这玩意不用转义也能运行啊,提示说这是不必要的转译)
        System.out.println("little 'cat'");
        //   \r  一个回车,回车跟换行不一样
        System.out.println("little\r\ncat");//在Idea里面是\r会覆盖掉前面的文字直接输出后面的
        System.out.println("阿瓦达啃大瓜\r哈哈哈");//但是在Windows CMD里面就是回车再重新覆盖
        //idea  (哈哈哈)
        //CMD   (哈哈哈啃大瓜)
        System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1200");
    }
}


//绝对目录和相对目录
//绝对目录是从盘符开始的目录
//相对目录是从某一确定的位置开始的    用..\的方式返回上级目录
class DosMingLIng //常见Dos命令
{
    public static void main(String[] args) {
    /*常见dos命令
    1.查看当前目录有什么东西  dir
        dir d:\123
    2.切换到其他的盘底下  cd (change directory)
        切换到C盘  cd/D C:
    3.切换到当前盘的其他目录下面(绝对/相对)
        cd D:\123\abc     cd..\..\123\abc
    4.切换到上一级是用两个点       ..\返回上一级
    5.切换到根目录是:  cd\
    6.查看指定目录下面的所有的子目录  tree
    7.清屏 cls(苍老师)
    8.退出dos exit
    9.其余命令(md [创建目录] rd [删除目录] copy [拷贝文件]
     del[删除文件] echo[输入内容到文件] type,move[剪切]
     */

    }
}
class BianLiang //变量
{
    public static void main(String[] args) {
        //变量三要素(类型+名称+值)
        int a;//定义整形数a [声明的变量之对此class范围内生效,例如其他的class里面也能定义a]
        a = 100;//变量再同一个作用域不能重复声明
        System.out.println(a);

        int b = 666;//换个书写方式
        System.out.println(b);

        int age = 20;      //int能存4个字节
        double score = 1234567890;//double是8个字节,就是最大10个数字
        char sex = '男';
        String name = "jeffrey";
        //输出信息,变量必须先声明然后再使用
        System.out.println("此人信息如下");
        System.out.println(age);
        System.out.println(score);
        System.out.println(sex);
        System.out.println(name);
        /*
        [数据类型]
        1.基本数据类型
            (1)数值型
                整数byte[1] short[2] int[4] long[8]
                浮点float[4]  double[8]
            (2)字符型 char[2],村法国单个字符
            (3)布尔型 boolean[1],存放true,false
        2.引用数据类型
            ()
         */
    }
}
class JiaHao //java中加号的使用
{
    public static void main(String[]args)
    {//都是数字就做计算,有字符就做拼接
        System.out.println(100+98);
        System.out.println("100"+98);
        System.out.println(100+98+"Hello");
        System.out.println("hello"+100+98);
    }
}