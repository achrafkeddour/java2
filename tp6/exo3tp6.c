#include<stdio.h>
#include<string.h>
#include<mpi.h>
int main(int argc,char* argv[]) {
int my_rank;
int p;
int source;
int dest;
int tag=0;
char message[100];
MPI_Status status ;
MPI_Init(&argc,&argv);
MPI_Comm_rank(MPI_COMM_WORLD, &my_rank);
MPI_Comm_size(MPI_COMM_WORLD, &p);
if(my_rank != 0) {
sprintf(message, "hello MPI world from process %d !",my_rank);
dest = 0;
MPI_Send(message, 100, MPI_CHAR, dest, tag, MPI_COMM_WORLD);
}
else {
printf("Hello MPI world from process 0 : num processes : %d\n",p);
for(source = 1; source <p ; source++) {
MPI_Recv(message,100,MPI_CHAR, source, tag, MPI_COMM_WORLD, &status);
printf("%s\n",message);
}
}
MPI_Finalize();
return 0;
}
