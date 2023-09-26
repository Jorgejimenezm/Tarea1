scanner preg = new scanner (System.in);

int a;
int b;
int resta;

System.out.println("introduce las cantidades que quieres restar");
a= preg.nextInt();
b= preg.nextInt();

resta = a-b;

System.out.println(a"-"b"="resta);