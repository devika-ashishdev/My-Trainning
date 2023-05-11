class BankAccountTrial{
static double balance=0;
static double deposit;
static double withdraw;
public static void main(String args[])
{
BankAccountTrial.getdetails();
BankAccountTrial.display();
}
public static void getdetails()
{
deposit=800;
withdraw=300;
}
public static void display()
{
System.out.println(deposit);
System.out.println(withdraw);
}

}