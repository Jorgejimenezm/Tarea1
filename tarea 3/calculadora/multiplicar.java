scanner preg = new scanner (System.in);

int a;
int b;
int mult;

System.out.println("introduce las cantidades que quieres multiplicar");
a= preg.nextInt();
b= preg.nextInt();

mult = a*b;

System.out.println(a"x"b"="mult);