#include <bits/stdc++.h>
using namespace std;
const int N = 1e6 + 5;
int A[N];
int copia[N];

void merge_sort(int l, int r){
    cout <<  "merge_sort( " << l <<  ", " << r << ")\n";
    if(l == r)
        return;

    int m = (l + r) / 2;
    merge_sort(l, m);
    merge_sort(m + 1, r);

    for(int i = l; i <= r; i++)
        copia[i] = A[i];

    int L = l;
    int R = m + 1;
    for(int i = l; i <= r; i++){
        if(L > m){ 
            A[i] = copia[R++];
        }else if(R > r){ 
            A[i] = copia[L++];
        }else{ 
            if(copia[L] <= copia[R]){
                A[i] = copia[L++];
            }else{
                A[i] = copia[R++];
            }
        }
    }
}


int main(){
    int n = 10;
    cin >> n;
    for(int i = 0; i < n; i++)
        cin >> A[i];

    merge_sort(0, n - 1);

    for(int i = 0; i < n; i++){
        cout << "A[" << i << "] = " << A[i] << "\n";
    }

    cerr << "Time elapsed: " << 1.0 * clock() / CLOCKS_PER_SEC << " s.\n";
    
    return 0;
}
