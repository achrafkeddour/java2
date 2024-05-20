#include<stdio.h>
#include<mpi.h> //on dois installer mpi...swaleh pour lexecuter
int main(int argc,char* argv[]) {
int rank,size;
MPI_Init(&argc,&argv);
MPI_Comm_rank(MPI_COMM_WORLD, &rank);
MPI_Comm_size(MPI_COMM_WORLD, &size);
printf("Hello, World, I am %d\n , of %d\n",rank , size);
MPI_Finalize();
return 0;
} 
