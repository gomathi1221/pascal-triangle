class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    l.add(1);
                }
                else{
                    List<Integer> prev=list.get(i-1);
                    l.add(prev.get(j)+prev.get(j-1));
                }
            }
            list.add(l);
        }
        return list;
    }
}