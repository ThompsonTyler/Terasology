/*
 * Copyright 2013 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.input.events;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.terasology.input.ButtonState;
import org.terasology.input.Input;
import org.terasology.input.InputModified;
import org.terasology.input.Keyboard;

public final class KeyUpEvent extends KeyEvent {

    private static KeyUpEvent event = new KeyUpEvent(Keyboard.Key.NONE, '\0', 0, InputModified.Modifier.NONE);

    private KeyUpEvent(Input key, char keyChar, float delta, InputModified.Modifier mod) {
        super(key, keyChar, ButtonState.UP, delta, mod);
    }

    public static KeyUpEvent create(Input key, char keyChar, float delta, InputModified.Modifier mod) {
        event.reset(delta);
        event.setKey(key, keyChar, mod);
        return event;
    }
}
