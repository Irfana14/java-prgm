#include <stdio.h>
 
int main()
{
  int year;
 
  printf("Enter a year to check if it is a leap year\n");
  scanf("%d", &year);
 
  if ( year%4 == 0) 
    printf("%d is a leap year.\n", year);
 else 
    printf("%d isn't a leap year.\n", year);  
 
  return 0;
}
