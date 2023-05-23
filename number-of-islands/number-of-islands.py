class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        # first check if the grid is empty or it has no ROWS
        if not grid or not grid[0]:
            return 0 # there is no island 

        visit = set()
        ROWS, COL = len(grid), len(grid[0])
        island = 0

        # dfs function to find which grid has the value of 1
        def dfs(i, j):
            if (
                i not in range(ROWS)
                or j not in range(COL) 
                or (i, j) in visit 
                or grid[i][j] == "0"
                ): 
                    return 0
            visit.add((i, j))
            dfs(i - 1, j)
            dfs(i + 1, j)
            dfs(i, j + 1)
            dfs(i, j -1)

        for i in range(ROWS):
            for j in range(COL):
                if grid[i][j] == "1" and (i,j) not in visit:
                    island += 1
                    dfs(i, j)


        return island

