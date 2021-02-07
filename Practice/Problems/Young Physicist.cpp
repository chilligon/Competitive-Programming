#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

 
int main()
{
    int n; cin>>n;
    int all_x = 0;
    int all_y = 0;
    int all_z = 0;
    while(n--){
        int a , b , c;
        cin>>a>>b>>c;
        all_x+=a;
        all_y+=b;
        all_z+=c;
    }
    if(all_x==0 && all_y==0 && all_z==0){
        cout<<"YES";
    }
    else{
        cout<<"NO";
    }
	
    return 0;
}
