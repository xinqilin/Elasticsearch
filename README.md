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

### ES放東西
1. GET/POST/PUT/DELETE /megacorp/emp/1
              索引名(類似db schema)/型態/id
2. 用postman put請求 選body->row->json <br>https://www.elastic.co/guide/cn/elasticsearch/guide/current/_indexing_employee_documents.html<br> 參考官方文件丟json

丟json

```json

PUT /megacorp/employee/1
{
    "first_name" : "John",
    "last_name" :  "Smith",
    "age" :        25,
    "about" :      "I love to go rock climbing",
    "interests": [ "sports", "music" ]
}

PUT /megacorp/employee/2
{
    "first_name" :  "Jane",
    "last_name" :   "Smith",
    "age" :         32,
    "about" :       "I like to collect rock albums",
    "interests":  [ "music" ]
}

PUT /megacorp/employee/3
{
    "first_name" :  "Douglas",
    "last_name" :   "Fir",
    "age" :         35,
    "about":        "I like to build cabinets",
    "interests":  [ "forestry" ]
}
```


response

```json

{
    "_index": "megacorp",
    "_type": "employee",
    "_id": "1",
    "_version": 1,
    "result": "created",
    "_shards": {
        "total": 2,
        "successful": 1,
        "failed": 0
    },
    "created": true
}

      .
      .
      .
      .
```

### 測試

Get請求  http://192.168.99.100:9200/megacorp/employee/1

res:

```json
{
    "_index": "megacorp",
    "_type": "employee",
    "_id": "1",
    "_version": 1,
    "found": true,
    "_source": {
        "first_name": "John",
        "last_name": "Smith",
        "age": 25,
        "about": "I love to go rock climbing",
        "interests": [
            "sports",
            "music"
        ]
    }
}

```

Head 請求 可以看有沒有這個員工

/_search 搜尋

Post _search 搜尋

```json
{
   "query":{
		"match":{
			"about":"rock climbing"
		}
   }
}

```


### Jest 融合ES
1. springBoot default使用兩種方式與ES溝通<br>一、Jest<br>二、SpringData ElasticSearch
2. 先使用Jest 先把jpa dependency 註解 導入jset 依賴，版本參考ES版本 5版對5版 這邊我用5.3.3
3. 在POJO primary key 要加 @JestId當主鍵


### SpringData 融合ES

1. spring.data.elasticsearch.cluster-name=elasticsearch (這個要看9200上面有)<br>spring.data.elasticsearch.cluster-nodes=192.168.99.100:9300 (這個是9300)


