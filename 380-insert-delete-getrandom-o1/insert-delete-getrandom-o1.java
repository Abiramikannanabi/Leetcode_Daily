class RandomizedSet {
    List<Integer> l;
    Map<Integer, Integer> map;
    Random random;
    public RandomizedSet() {
        l=new ArrayList<>();
        map=new HashMap<>();
        random=new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))   return false;
        map.put(val,l.size());
        l.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val))    return false;
        int ind=map.get(val);
        int last=l.get(l.size()-1);
        map.put(last,ind);
        l.set(ind,last);
        l.remove(l.size()-1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        int r=random.nextInt(l.size());
        return l.get(r);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */