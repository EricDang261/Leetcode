class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        # first check if the grid is empty
        if not grid:
            return 0 # there is no island 

        visit = set()
        ROWS, COL = len(grid), len(grid[0])
        island = 0

        def bfs(i , j):
            q = collections.deque()
            q.append((i, j))
            visit.add((i, j))
            
            while q:
                row, col = q.popleft()
                dirs = [[0,1], [0, -1], [1, 0] , [-1, 0]]

                for dr, dc in dirs:
                    new_row, new_col = row + dr, col + dc
                    if (
                        (new_row) in range(ROWS)
                        and (new_col)  in range(COL) 
                        and grid[new_row][new_col] == "1"
                        and (new_row, new_col) not in visit 
                        ): 
                            q.append((new_row, new_col))
                            visit.add((new_row, new_col))


        for i in range(ROWS):
            for j in range(COL):
                if grid[i][j] == "1" and (i,j) not in visit:
                    island += 1
                    bfs(i, j)


        return island

