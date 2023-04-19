

class pair{
	int node;
	int value;

	public pair(int n, int v){
		this.node=n;
		this.value=v;
	}
}


class Solution {
	public int countPaths(int n, int[][] roads) {
	//Creating adj list
		ArrayList<ArrayList<pair>> adj = new ArrayList<>();
		for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
		for(int i=0;i<roads.length;i++){
			 adj.get(roads[i][0]).add(new pair(roads[i][1], roads[i][2]));
			 adj.get(roads[i][1]).add(new pair(roads[i][0], roads[i][2]));
			 
			
		}

		Queue<pair> q = new PriorityQueue<>((x,y)->x.value-y.value);
		int[] values = new int[n];
		int[] distance = new int[n];
		Arrays.fill(values,Integer.MAX_VALUE);
		values[0]=0; 
		distance[0]=1; 
		int mod = 1000000000+7;

		q.offer(new pair(0,0));
		while(!q.isEmpty()){
			int node = q.peek().node; 
			int value = q.peek().value;
			q.poll();

			for(pair p:adj.get(node)){  
				int newnode = p.node;
				int newvalue = p.value;

				if(value+newvalue < values[newnode]){
					values[newnode] = value+newvalue;
					distance[newnode]=distance[node];
					q.offer(new pair(newnode, values[newnode]));
				}

				else if(value+newvalue == values[newnode]){ 
					distance[newnode]=(distance[newnode]+ distance[node])%mod; 
				}
			}
		}

		return distance[n-1]%mod; 
	}
}