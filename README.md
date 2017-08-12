# BPMN2-Modeler/DeveloperTutorial

This project provide a example code showing how to extend the [Eclipse BPMN2 Modeler Plugin](https://www.eclipse.org/bpmn2-modeler/).

The code is based on the [developer tutorials](https://wiki.eclipse.org/BPMN2-Modeler/DeveloperTutorials) provided by the Eclipse BPMN2 Wiki pages.  The example extends the BPMN2 Runtime and implement a custom task element. 
You can find the information about the implementation and concepts on the [BPMN2 Tutorial pages](https://wiki.eclipse.org/BPMN2-Modeler/DeveloperTutorials).

## Eclipse BPMN2

The [Business Process Model and Notation (BPMN 2.0)](http://www.omg.org/spec/BPMN/2.0/) introduces an extensibility mechanism that allows extending standard BPMN elements with additional attributes. It can be used by modelers and modeling tools to add non-standard elements or Artifacts to satisfy a specific need, such as the unique requirements of a vertical domain, and still have valid BPMN Core.

The goal of the Eclipse BPMN2 Modeler is to not only provide a graphical modeling tool, but also to allow plug-in developers to easily customize the behavior and appearance of the editor for specific BPM workflow engines that use this BPMN 2.0 extensibility mechanism.


## The Environment

First, install the BPMN2 Modeler plugin from the [updatesite](http://download.eclipse.org/bpmn2-modeler/updates/) into your Eclipse development IDE. Most things can be controlled from the plugin editor and Eclipse will take care of finding and installing dependencies for the BPMN2 Modeler plugin.

## How to Contribute

The BPMN2-Modeler/DeveloperTutorial is an open source project and we sincerely invite you to participate in it. You can help to improve the project by reporting new issues or start a discussions using the [issue tracker](https://github.com/rsoika/bpmn2-tutorial/issues).