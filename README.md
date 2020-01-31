# t-ui2

## The goal
I need to rewrite t-ui in order to allow more people to contribute. Actually the code is a mess and I'm the only who can understand what's happening. It's a pain to add new features. I hope this refactoring can make t-ui a proper open source project, with a lot of contributors from all over the world. Thank you!

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

## Contact me
* E-Mail: andreuzzi.francesco@gmail.com
* Twitter: @f_andreuzzi
