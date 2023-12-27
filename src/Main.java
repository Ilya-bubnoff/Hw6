
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
for(int i = 1; i<=10;i++){
    System.out.println(i);
}
for(int i = 10; i>0;i--){
    System.out.println(i);
}
for(int i = 0; i<17;i=i+2){
    System.out.println(i);
}
for(int i = 10; i>=-10;i--){
    System.out.println(i);
        }
for(int i = 1904;i<=2096;i=i+4){
    System.out.println(i+" Год является високосным");
        }
for(int i = 7; i<=98;i=i+7) {
    System.out.println(i);
}
for(int i = 1; i<=512;i=i*2) {
    System.out.println(i);
        }
int savings=29000;
int total=0;
for(int i = 1; i<=12;i++) {
total= total+savings;
    System.out.println("Месяц "+i+" ,сумма накоплений равна "+total+" рублей");}
int sum=29000;
int amountofSavings=0;
for(int i = 1; i<=12;i++) {
    amountofSavings = amountofSavings+amountofSavings/100;
    amountofSavings = amountofSavings+sum;
    System.out.println("Месяц "+i+" ,сумма накоплений равна "+amountofSavings+" рублей");
}
int A =2;
for(int i = 1; i<=10;i++){
            System.out.println(A+"*"+i+"="+A*i);
        }
    }
}