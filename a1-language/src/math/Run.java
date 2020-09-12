package math;

public class Run {

    public static void main(String[] args) {

        double x = 1;
        int y = 2;
        double e = 1;
        double A =1;
        int z = 2;


        Math.abs(12.3); //12.3 返回这个数的绝对值
        Math.abs(-12.3); //12.3

        Math.copySign(1.23, -12.3); //-1.23,返回第一个参数的量值和第二个参数的符号
        Math.copySign(-12.3, 1.23); //12.3

        Math.signum(x); //如果x大于0则返回1.0，小于0则返回-1.0，等于0则返回0
        Math.signum(12.3); //1.0
        Math.signum(-12.3); //-1.0
        Math.signum(0); //0.0


        //指数
        Math.exp(x); //e的x次幂
        Math.expm1(x); //e的x次幂 - 1

        Math.scalb(x, y); //x*(2的y次幂）
        Math.scalb(12.3, 3); //12.3*2&sup3;

        //取整
        Math.ceil(12.3); //返回最近的且大于这个数的整数13.0
        Math.ceil(-12.3); //-12.0

        Math.floor(12.3); //返回最近的且小于这个数的整数12.0
        Math.floor(-12.3); //-13.0

        //x和y平方和的二次方根
        Math.hypot(x, y); //&radic;（x&sup2;+y&sup2;）

        //返回概述的二次方根
        Math.sqrt(x); //&radic;(x) x的二次方根
        Math.sqrt(9); //3.0
        Math.sqrt(16); //4.0

        //返回该数的立方根
        Math.cbrt(27.0); //3
        Math.cbrt(-125.0); //-5

        //对数函数
        Math.log(e); //1 以e为底的对数
        Math.log10(100); //10 以10为底的对数
        Math.log1p(x); //Ln（x+ 1）

        //返回较大值和较小值
        Math.max(x, y); //返回x、y中较大的那个数
        Math.min(x, y); //返回x、y中较小的那个数

        //返回 x的y次幂
        Math.pow(x, y);
        Math.pow(2, 3); //即2&sup3; 即返回：8

        //随机返回[0,1)之间的无符号double值
        Math.random();

        //返回最接近这个数的整数,如果刚好居中，则取偶数
        Math.rint(12.3); //12.0
        Math.rint(-12.3); //-12.0
        Math.rint(78.9); //79.0
        Math.rint(-78.9); //-79.0
        Math.rint(34.5); //34.0
        Math.rint(35.5); //36.0
        Math.round(12.3); //与rint相似，返回值为long

        //三角函数
        Math.sin( A); //sin（A）的值
        Math.cos( A); //cos（A）的值
        Math.tan( A); //tan（A）的值

//		//求角 
//		int x0=1;
//		int y0=1;
//		Math.asin(x/z); //返回角度值[-&pi;/2，&pi;/2] arc sin（x/z） 
//		Math.acos(y/z); //返回角度值[0~&pi;] arc cos（y/z） 
//		Math.atan(y/x); //返回角度值[-&pi;/2，&pi;/2] 
//		Math.atan2(y-y0, x-x0); //同上，返回经过点（x，y）与原点的的直线和经过点（x0，y0）与原点的直线之间所成的夹角 
//		 
//		Math.sinh(x); //双曲正弦函数sinh(x)=(exp(x) - exp(-x)) / 2.0; 
//		Math.cosh(x); //双曲余弦函数cosh(x)=(exp(x) + exp(-x)) / 2.0; 
//		Math.tanh(x); //tanh(x) = sinh(x) / cosh(x); 
//		 
//		//角度弧度互换 
//		double angrad=1;
//		double angdeg=1;
//		Math.toDegrees(angrad); //角度转换成弧度，返回：angrad * 180d / PI 
//		Math.toRadians(angdeg); //弧度转换成角度，返回：angdeg / 180d * PI 

    }

}
