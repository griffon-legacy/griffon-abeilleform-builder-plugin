/*
 * griffon-abeilleformbuilder: AbeilleForms Griffon plugin
 * Copyright 2010 and beyond, Jim Shingler
 *
 * AbeilleForms is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

/**
 * @author Jim Shingler
 */
class AbeilleformBuilderGriffonPlugin {
    String version = '0.4'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [:]
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'GNU Lesser Public License 2.1'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-abeilleform-builder-plugin'

    List authors = [
        [
            name: 'Jim Shingler',
            email: 'ShinglerJim@gmail.com'
        ]
    ]
    String title = 'A Builder for Abeille Forms'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
Brings the [AbeilleFormBuilder][1] libraries (based on [Abeille Forms 2.1.0 M1][2]) into your Griffon application.

Usage
----
AbeilleForm nodes are added by default to the root builder without a prefix, which means you can call them directly.
Refer to the [builder's][1] page to known what nodes are available.


[1]: http://griffon.codehaus.org/AbeilleFormBuilder
[2]: http://abeille.dev.java.net
'''
}
