class Solution {
public:
    bool canAttendMeetings(vector<vector<int>>& intervals) {
        if(intervals.empty()) return true; 
        // sort all the meeting time frame ( start time)
        sort(intervals.begin(), intervals.end());
        
        for(size_t i = 0 ; i < intervals.size() - 1; i++){
            if(intervals[i][1] > intervals[i+1][0]) return false; // the end of the 1st meeting l
        }
        return true;
    }
};