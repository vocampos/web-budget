/*
 * Copyright (C) 2019 Arthur Gregorio, AG.Software
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.com.webbudget.domain.logics.registration.card;

import br.com.webbudget.domain.entities.registration.Card;
import br.com.webbudget.domain.exceptions.BusinessLogicException;

import javax.enterprise.context.Dependent;

/**
 * Validator logic to check if the expiration day is correct for a credit {@link Card}
 *
 * @author Arthur Gregorio
 *
 * @version 1.0.0
 * @since 3.0.1, 11/05/2019
 */
@Dependent
public class DueDayValidator implements CardSavingLogic, CardUpdatingLogic {

    /**
     * {@inheritDoc}
     *
     * @param value
     */
    @Override
    public void run(Card value) {
        if (!value.expirationDayIsValid()) {
            throw new BusinessLogicException("error.card.invalid-expiration-day");
        }
    }
}
