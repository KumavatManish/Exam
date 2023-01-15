#include<stdio.h>
#include<sys/wait.h>
#include<stdlib.h>
#include<unistd.h>

void main()
{
  pid_t id;
  id=fork();
if(id>0)
{
 printf("Parent Started Executing \n");
 printf("Waiting for child to finish \n");
 wait(NULL);
 printf("Parent Exiting \n");
}
else
{
 printf("Child Executing \n");
 int arr[]={1,2,3,4,5};
 int i;
 for(i=0;i<5;i++)
 {
 sleep(5);
 printf("%d \n",arr[i]); 
 }
 printf("child Finished \n");
 exit(0);
}
}

