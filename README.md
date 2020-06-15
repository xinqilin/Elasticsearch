# Elasticsearch

--------

# 前置作業
1. docker search elasticsearch
2. docker pull elasticsearch:版本 (最新版好像有問題 7.7.1，我用5.6.9)
3. elasticsearch很吃ram(2G) 要限制run時的大小 -e<br>docker run -e ES_JAVA_OPTS="-Xms256m -Xmx256m" -d -p 9200:9200 -p 9300:9300 --name ES01 [imageID] <br>9200 ES本身port 9300 ES內每個端點port
4. 瀏覽器=> ip:9200
```json
{
	name: "YUdMhHc",
	cluster_name: "elasticsearch",
	cluster_uuid: "b9M6ryIjSty-Q_w8tdUj3Q",
	version: {
		number: "5.6.9",
		build_hash: "877a590",
		build_date: "2018-04-12T16:25:14.838Z",
		build_snapshot: false,
		lucene_version: "6.6.1"
	},
	tagline: "You Know, for Search"
}

```
