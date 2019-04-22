# token query

curl -X POST \
  http://localhost:8083/auth/oauth/token \
  -H 'Accept: */*' \
  -H 'Authorization: Basic Y2xpZW50SWQ6c2VjcmV0' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Type: application/x-www-form-urlencoded' \
  -H 'Host: localhost:8083' \
  -H 'Postman-Token: 7bfb01fe-0753-4b9d-8d86-5a73db7a3b50,6da210ef-d2d4-474e-9761-e863a35bda97' \
  -H 'User-Agent: PostmanRuntime/7.11.0' \
  -H 'accept-encoding: gzip, deflate' \
  -H 'cache-control: no-cache' \
  -H 'content-length: 47' \
  -H 'cookie: JSESSIONID=A3942E3C1D59F708A496B15DE5E87D30' \
  -b JSESSIONID=A3942E3C1D59F708A496B15DE5E87D30 \
  -d 'grant_type=password&username=test&password=test'