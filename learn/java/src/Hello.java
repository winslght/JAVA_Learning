//java��ʼѧϰ������
/*
    1.public class hello ��ʾhello��һ���࣬��һ��public����
    2.Hello{}��ʾһ����Ŀ�ʼ������
    3.public static void main(String[] args) ��ʾһ���������������ǳ�������'S'�Ǵ�д
    4.main(){}��ʾ�����Ŀ�ʼ
    5.System.out.println("Hello world~");�������hello world����Ļ��
    6.;��ʾ���Ľ���
    7.class��һ���࣬һ����������кü����࣬����publicֻ����һ��,class��ߵ�������ĸ�����д
    8.ÿһ��class����֮��ÿһ���඼�����ɶ�Ӧ��class�ļ��������пյ���
*/   //����ע�Ͳ���Ƕ��ʹ��

/**
 * @author winslght             //������ĵ���ǩ,�������ɶ�Ӧ���ĵ�ע��
 * @version 1.0                 //��Դ����Ŀ¼��cmd��javadoc���������ɶ�Ӧ���ĵ�ע��,����������������
 */                             //javadoc -d d:\\Java_Doc -author -version Hello.java
                                //javadoc -d �ļ���Ŀ¼ -xx -yy �ļ�����.java   (��ʽ)
public class Hello//���public���Hello��������ļ������ƾͽ�Hello��һ�ľͱ���
{
    public static void main(String[]args)
        {
            System.out.println("Hello world!");
        }
}



class Dog//һ��Դ�ļ���public��ֻ����һ������������������ޣ������пյ���
{
    public static void main(String[]args)//main����Ҳ����д�ڷ�public�����棬Ȼ�����ָ�����з�public��
                                        //�������з�public��ķ���
    {
        System.out.println("Hello,С����");
    }
}



class ZhuanYiFu  //ת���
{
    public static void main(String[]args)
//ת���ַ���ʹ��
//JAVA���õ�ת���ַ���:(ת�����ת���ַ������壬����������)
    {   //   \t  һ���Ʊ�λ��ʵ�ֶ���Ĺ���
        System.out.println("little\tcat");
        //   \n  ���з�
        System.out.println("little\ncat");   //cmd����̨��Tab����ʵ�����ȫ
        //   \"  һ��"����
        System.out.println("����˵���������ġ�");//�������ĵ����ţ�����ת�����ֱ����
        System.out.println("����˵��\"������\"");
        //   \\  һ��\����
        System.out.println("little\\cat");
        //   \'  һ��'����       (��,'�����ⲻ��ת��Ҳ�����а�,��ʾ˵���ǲ���Ҫ��ת��)
        System.out.println("little 'cat'");
        //   \r  һ���س�,�س������в�һ��
        System.out.println("little\r\ncat");//��Idea������\r�Ḳ�ǵ�ǰ�������ֱ����������
        System.out.println("���ߴ�д��\r������");//������Windows CMD������ǻس������¸���
        //idea  (������)
        //CMD   (�������д��)
        System.out.println("����\t����\t�۸�\t����\n����\t�޹���\t120\t1200");
    }
}


//����Ŀ¼�����Ŀ¼
//����Ŀ¼�Ǵ��̷���ʼ��Ŀ¼
//���Ŀ¼�Ǵ�ĳһȷ����λ�ÿ�ʼ��    ��..\�ķ�ʽ�����ϼ�Ŀ¼
class DosMingLIng //����Dos����
{
    public static void main(String[] args) {
    /*����dos����
    1.�鿴��ǰĿ¼��ʲô����  dir
        dir d:\123
    2.�л����������̵���  cd (change directory)
        �л���C��  cd/D C:
    3.�л�����ǰ�̵�����Ŀ¼����(����/���)
        cd D:\123\abc     cd..\..\123\abc
    4.�л�����һ������������       ..\������һ��
    5.�л�����Ŀ¼��:  cd\
    6.�鿴ָ��Ŀ¼��������е���Ŀ¼  tree
    7.���� cls(����ʦ)
    8.�˳�dos exit
    9.��������(md [����Ŀ¼] rd [ɾ��Ŀ¼] copy [�����ļ�]
     del[ɾ���ļ�] echo[�������ݵ��ļ�] type,move[����]
     */

    }
}
class BianLiang //����
{
    public static void main(String[] args) {
        //������Ҫ��(����+����+ֵ)
        int a;//����������a [�����ı���֮�Դ�class��Χ����Ч,����������class����Ҳ�ܶ���a]
        a = 100;//������ͬһ�����������ظ�����
        System.out.println(a);

        int b = 666;//������д��ʽ
        System.out.println(b);

        int age = 20;      //int�ܴ�4���ֽ�
        double score = 1234567890;//double��8���ֽ�,�������10������
        char sex = '��';
        String name = "jeffrey";
        //�����Ϣ,��������������Ȼ����ʹ��
        System.out.println("������Ϣ����");
        System.out.println(age);
        System.out.println(score);
        System.out.println(sex);
        System.out.println(name);
        /*
        [��������]
        1.������������
            (1)��ֵ��
                ����byte[1] short[2] int[4] long[8]
                ����float[4]  double[8]
            (2)�ַ��� char[2],�巨�������ַ�
            (3)������ boolean[1],���true,false
        2.������������
            ()
         */
    }
}
class JiaHao //java�мӺŵ�ʹ��
{
    public static void main(String[]args)
    {//�������־�������,���ַ�����ƴ��
        System.out.println(100+98);
        System.out.println("100"+98);
        System.out.println(100+98+"Hello");
        System.out.println("hello"+100+98);
    }
}