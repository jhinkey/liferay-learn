# Search Upgrade Paths 

The following table provides the steps for upgrading from your current Liferay product versions and search engine stack to a search engine stack on Liferay 7.3. Find the scenario that matches the Liferay version and Liferay Enterprise Search (LES) version (if you're using LES), and the search engine stack you're upgrading from. Then follow the steps listed in the scenario's *Upgrade Steps* column.

| Scenario | Liferay Version \[& LES Version\] | Search Engine Stack | Upgrade Steps to Liferay 7.3 |
| :-- | :-------- | :---------------- | :-------------- |
| 1.  | **Liferay 7.0** | Elasticsearch 2.x | 1. Set up Elasticsearch 7.9+<br><br>2. Configure the Elasticsearch 7 connector on Liferay 7.3 to the new Elasticsearch server.<br><br>3. Configure security.<br><br>4. Upgrade the Liferay database.<br><br>5. Re-index search & spell check indexes. |
| 2.  | **Liferay 7.0** | Elasticsearch 6.x | Same as *Scenario 1.* |
| 3.  | **Liferay 7.0 + LES 2.0** (*Security*, *Monitoring*) | Elasticsearch 6.x | 1. Follow steps 1-3 of *Scenario 1.*<br><br>2. Install Kibana 7.9+ if you are currently using *Kibana and Monitoring*.<br><br>3. Install and deploy LES Monitoring if you are currently using Kibana and *Elasticsearch Monitoring/X-Pack Monitoring*.<br><br>4. Configure the *Elasticsearch Monitoring* connector if you are using *LES Monitoring* or *Connector to X-Pack Monitoring*.<br><br>5. Follow steps 4-5 of *Scenario 1.* |
| 4.  | **Liferay 7.1** | Elasticsearch 6.x | Same as *Scenario 1.* |
| 5.  | **Liferay 7.1 + LES 2.0** (*Security*, *Monitoring*) | Elasticsearch 6.x | Same as *Scenario 3.* |
| 6.  | **Liferay 7.2** | Elasticsearch 6.x | Same as *Scenario 1.* |
| 7.  | **Liferay 7.2 + LES 2.0** (*Security*, *Monitoring*) | Elasticsearch 6.x | Same as *Scenario 3.* |
| 8.  | **Liferay 7.2** | Elasticsearch 7.3.x-7.8.x | Same as *Scenario 1.* |
| 9.  | **Liferay 7.2 + LES 2.0** (*Monitoring*, *Learning to Rank*) | Elasticsearch 7.3.x-7.8.x | Same as *Scenario 3.* |
| 10. | **Liferay 7.2** | Elasticsearch 7.9+ | Same as *Scenario 1.*, but skip the first step because you're on Elasticsearch 7.9+ already. |
| 11. | **Liferay 7.2 + LES 3.0** (*Monitoring*, *Learning to Rank*) | Elasticsearch 7.9+ | Same as *Scenario 3.*, but skip the first step because you're on Elasticsearch 7.9+ already. |
| 12. | **Liferay 7.0** | Solr 5.x | 1. Set up Solr 8.x.<br><br>2. Upgrade the Liferay database.<br><br>Re-index search and spell check indexes. |
| 12. | **Liferay 7.1, 7.2** | Solr 7.x | 1. Set up Solr 8.x.<br><br>2. Upgrade the Liferay database.<br><br>Re-index search and spell check indexes. |

