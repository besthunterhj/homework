#include <iostream>
using namespace std;

void mine(int n)
{
	bool path[n + 1][n + 1];	//����·����ͨ������(��1��ʼΪ��һ���±�)
	
	for (int i = 1; i <= n; i++)
	{
		path[i][i] = true;		//ÿ���ؽ��Լ�����ͬ�� 
	}
	
	int i,j;
	do
	{
		cin>>i>>j;
		path[i][j] = true;
	}
	while (i != 0 && j != 0);
	
	int m[n + 1];
	int maxmine = 0;
	for (int i = n; i >= 1; i--)
	{
		m[i] = m[i] + a[i]; 
		for (int k = i; k <= n; k++)
		{
			if (path[i][k] == true)
			{
				m[i] = max(m[i], m[k] + a[i]);
			}
			else continue;
		}
		
		for (int i = 0; i < n; i++)
		{
			
		}
	}
 } 

int main()
{
	int num;
	cin>>num;
	const int n = num;
	int array[n];	//���õؽ�����
	
	for (int i = 0; i < n; i++)
	{
		cin>>array[i];
	 } 
	 

	return 0;
 } 
