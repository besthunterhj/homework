#include <iostream>
#include <math.h>
using namespace std;

double expression(double x)
{
	double fx;
	double x5 = x * x * x * x * x;
	double x4 = x * x * x * x;
	double x3 = x * x * x;
	double x2 = x * x;
	fx = x5 - 15 * x4 + 85 * x3 - 225 * x2 + 274 * x - 121;
	return fx;
}

double binarySearch(double min, double max)
{
	double mid = (min + max) / 2;
	if (fabs(expression(mid)) < 0.0000001) return mid;
	if (fabs(expression(mid)) > 0.1) return binarySearch(mid, max);
	if (fabs(expression(mid)) < 0.1 && fabs(expression(mid)) > 0,000001) return binarySearch(min, mid);
}


int main()
{
	double num;
	num = binarySearch(1.5, 2.4);
	cout<<num;
	return 0;
}
