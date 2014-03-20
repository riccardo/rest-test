#!/bin/bash

echo 'Building Eclipse projects'
mvn clean package eclipse:eclipse -D eclipse.pde install
