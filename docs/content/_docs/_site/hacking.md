# Hacking FastForward

This document covers some of the majors components in FastForward.

#### Module

A module is a loadable component that extends the functionality of FastForward.
When a module is loaded it typically registers a set of plugins.

#### Plugin

Either an input, or an output plugin.

This provides the implementation to read, or send data from the agent.
A plugin can have multiple _instances_ with different configurations (like
which port to listen to).

#### Early Injector

The early injector is setup by AgentCore and is intended to provide the basic
facilities to perform module setup.

The following is a list of components that are given access to and their
purpose.

* _com.spotify.ffwd.module.PluginContext_
  Register input and output plugins.
* _com.fasterxml.jackson.databind.ObjectMapper (config)_
  ObjectMapper used to parse provided configuration file.

#### Primary Injector

The primary injector contains the dependencies which are available after
modules have been registered and the initial bootstrap is done.

It contains all the components of the early injector, with the following
additions.

* _eu.toolchain.async.AsyncFramework_ - Framework implementation to use for
  async operations.
* _io.netty.channel.EventLoopGroup (boss)_ Event loop group used for boss
  threads in ServerBootstrap's.
* _io.netty.channel.EventLoopGroup (worker)_ Event loop group used for
  worker threads in {Server}Bootstrap's.
* _com.spotify.ffwd.protocol.ProtocolServers_ - Framework for setting up
  servers in a simple manner.
* _com.spotify.ffwd.protocol.ProtocolClients_ - Framework for setting up
  clients in a simple manner.
* _io.netty.util.Timer_ - A timer implementation.
* _com.fasterxml.jackson.databind.ObjectMapper (application/json)_
  Used to decode/encode JSON.
