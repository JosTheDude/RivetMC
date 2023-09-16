# RivetMC
Unofficial Implementation of Rivet into Minecraft for Scaling

## What is this?
This allows Minecraft servers (ex. minigames networks) to use and connect to [Rivet](https://rivet.gg/) in order to manage and scale their servers. Rivet is a self-hosted / cloud based game server management platform which easily allows you to scale services up and down utilizing a [NOMAD](https://developer.hashicorp.com/nomad) backend.

## When would I use this?
This is intended for use with servers that needed ultra-scalability and also ease of use. The general standard of minigame networks (or similar) within MC is to build your own autoscaler using different technologies due to a lack of mc-dedicated solutions or probable solutions outside of 99% of server's budgets (ex. AWS). It's meant to be easy to setup and simple to implement on the development side. If you're looking to start a bedwars server or make a stupidly scalable MultiPaper-based SMP, this is for you.

## Setup
Before getting started, we assume that you have adequate knowledge of how [Docker](https://docker.com) works, and that you have the [Rivet CLI](https://github.com/rivet-gg/cli) downloaded.
1. Create a docker file for the server, Rivet runs everything as a docker container, [here's a super basic example of one](https://gist.github.com/SantioMC/88ebba595326d4686465b16f608e675a).
2. Go to the server you wish to deploy, and initialize Rivet using `rivet init`. If you don't want to configure rivet you can use the example file at [this github gist](https://gist.github.com/SantioMC/6bbe2cd5a3bbc40242e0b1c892d51004). (You still need to run this command to initialize rivet and to configure some other settings)
3. Before we deploy, install the RivetMC plugin on the server you wish to deploy. This allows the server to communicate with Rivet.

This process should be repeated for every server you wish to deploy.

## Authors:
- JosTheDude
- SantioMC

## Credits & Acknowledgements
- [Rivet](https://rivet.gg/) - For being an awesome platform and working closely with us on delivering this. They provided us with access to their beta and have been very helpful in the development of this project.
