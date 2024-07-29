# Elastic stack (ELK) on Docker

### Bringing up the stack

Clone this repository onto the Docker host that will run the stack with the command below:

```sh
git clone https://github.com/deviantony/docker-elk.git
```
Download docker desktop and start it in the background

Then, initialize the Elasticsearch users and groups required by docker-elk by executing the command:

```sh
docker-compose up setup
```

If everything went well and the setup completed without error, start the other stack components:

```sh
docker-compose up
```

Give Kibana about a minute to initialize, then access the Kibana web UI by opening <http://localhost:5601> in a web
browser and use the following (default) credentials to log in:

* user: *elastic*
* password: *changeme*
