#!/usr/bin/env bash

echo 'Building docker image gateway-zuul'
docker build -t eu.gcr.io/stdstack/gateway-zuul:0.1 .
echo 'Image gateway-zuul built'