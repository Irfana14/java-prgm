#include <stdio.h>

int main(void) {
	// your code goes here
	int a,b,c;

	scanf("%d\n",&a);
	scanf("%d\n",&b);
  scanf("%d\n",&c);
	
  if((a>b)&(a>c))
	
	printf("%d is greater",a);
	else if((b>a)&(b>c))
	printf("%d is greater",b);
	else
	printf("%d is greater",c);
	
	return 0;
}
