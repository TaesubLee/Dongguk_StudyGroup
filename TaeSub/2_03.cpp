//3. num1�̶�� ���ڸ� �Է¹޾� 50���� ������ num2�� 0, ũ�� 100�� ����ϴ� ���α׷��� ������
//(���� 3�� ������ �̿�)
/*
	���� ������ ����
	���� ? true �� �� ����1 : false �� �� ����2
	���� num1<50 ? num2=0 : num2 =100

*/


#include <stdio.h>

int main(void)
{
	int num1, num2;
	
	printf("num1�� ���� �����ΰ���? : ");
	scanf_s("%d", &num1);

	num2 = (num1 < 50) ? 0 : 100;
	printf("num2�� ���� %d", num2);
	 

	return 0;


}