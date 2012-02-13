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

def configText = """root.'griffon.builder.abeilleform.AbeilleFormBuilder'.view = '*'"""
if(!(builderConfigFile.text.contains(configText))) {
    println 'Adding AbeilleFormBuilder to Builder.groovy'
    builderConfigFile.append("""
$configText
""")
}