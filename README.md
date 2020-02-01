# t-ui 2

[![CircleCI](https://circleci.com/gh/fAndreuzzi/t-ui2/tree/master.svg?style=svg)](https://circleci.com/gh/fAndreuzzi/t-ui2/tree/master)

## The goal
I need to rewrite t-ui in order to allow more people to contribute. Actually the code is a mess and I'm the only who can understand what's happening. It's painful to add new features. I hope this refactoring can make t-ui a proper open source project, with a lot of contributors from all over the world. Thank you!

## Can I help you?
Whoever wants to help is welcome! We need a lot of people in order to rewrite t-ui and add a lot of features. Please write me an e-mail if you want to join our Telegram group (a special group for those who are contributing to t-ui2). You can also fix some issues if you want :)

## Architecture
I'd like to write better code than the previous one. So, t-ui2 will be composed of 3 big modules:
* *Core*
  + t-ui commands
  + build suggestions (*UI* will take suggestions from *Core*)
* *UI*
  + input/output
  + show suggestions
  + show device info
* *Platform*
  + files
  + apps
  + tty
  + read and store prefs in an hash map(?) 

*UI* shouldn't compute anything, it needs to show data from *Core* and to receive input from the user. *Core* shouldn't contain Android specific code, but it should tell *Platform* when, for instance, the user wants to launch an application.

## Roadmap
* Step 1: TTY
* Step 2: t-ui commands
* Step 3: apps and alias
* Step 4: suggestions and prefs

Each step will result in a working app.

## Technologies and how to contribute
I'll be using [CircleCI](https://circleci.com/) for CI. It's the first time for me, so be patient :D

We'll be using Git as VCS. There are two branches:
* *master*: only **working** features here. A **fully working** APK will be available every time we merge to *master*.
* *develop* : Pull requests go here. When you want to merge, prepare a pull request to *develop*.

I will merge *develop* and *master* periodically, every time a new feature is ready for production.

## Test, test, test
One of the biggest errors I made with the first version of t-ui is underconsidering the importance of Unit tests. When you add a new feature, consider adding also some tests to ensure it's working fine. If someone else breaks your code, your test will let us now where is the problem and how to fix it.

## Contact me
* E-Mail: andreuzzi.francesco@gmail.com
* Twitter: @f_andreuzzi
