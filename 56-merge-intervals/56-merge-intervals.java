class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1) return intervals;
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]); //Sort asc by first index
        int counter = intervals.length;
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<List<Integer>> outputList = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            //If current start is less than a previous end, can merge
            if (intervals[i][0] <= end) {
                //Update end
                end = Math.max(intervals[i][1], end);
                intervals[i][0] = -1; //Make start index null because merged
                counter--;
            }
            //If not <= , make it start and end
            else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(start);
                temp.add(end);
                outputList.add(temp);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        //Add last one
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(start);
        temp.add(end);
        outputList.add(temp);        
        int[][] returnArr = new int[counter][2];
        for (int i = 0; i < outputList.size(); i++) {
            returnArr[i][0] = outputList.get(i).get(0);
            returnArr[i][1] = outputList.get(i).get(1);
        }
        return returnArr;
    }
}