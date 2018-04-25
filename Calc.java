//需求: 计算两操作数的 和,差,乘积,商
//定义一个类名为 Calc
public class Calc
{	
	public static void main(String[] args)
	{
		int a = 16;  //第一个操作数
		int b = 10; //第二个操作数
		System.out.println(a + b); //打印两个操作数和
		System.out.println(a - b); //打印两个操作数差
		System.out.println(a * b); //打印两个操作数乘积
		System.out.println(a / b); //打印两个操作数商

		System.out.println("--------------------");

		a = 6;  //重新赋值第一个操作数
		b = 3; //重新赋值第二个操作数
		System.out.println(a + b); //打印两个操作数和
		System.out.println(a - b); //打印两个操作数差
		System.out.println(a * b); //打印两个操作数乘积
		System.out.println(a / b); //打印两个操作数商
	}
} 
