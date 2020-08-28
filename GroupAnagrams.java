class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List> res = new HashMap<String,List>();
        for(String s:strs){
            char[] val = s.toCharArray();
            Arrays.sort(val);
            String key = String.valueOf(val);
            if(!res.containsKey(key)){
                res.put(key,new ArrayList());
            }
            res.get(key).add(s);
        }
        return new ArrayList(res.values());
    }
}
