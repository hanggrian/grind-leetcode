import globals from 'globals';
import js from '@eslint/js';
import eslintPluginJs from '@stylistic/eslint-plugin-js';
import eslintPlugin from '@typescript-eslint/eslint-plugin';
import parser from '@typescript-eslint/parser';

export default [
  {
    files: ['**/*.js'],
    plugins: {
      '@stylistic/js': eslintPluginJs,
    },
    rules: {
      ...js.configs.recommended.rules,
      '@stylistic/js/semi': 'error',
    },
    languageOptions: {
      ecmaVersion: 2022,
      sourceType: 'module',
      globals: {
        ...globals.node,
      },
    },
  },
  {
    files: ['**/*.ts'],
    plugins: {
      '@typescript-eslint': eslintPlugin,
    },
    rules: eslintPlugin.configs.recommended.rules,
    languageOptions: {
      parser: parser,
      ecmaVersion: 2022,
      sourceType: 'module',
      globals: {
        ...globals.node,
      },
    },
  },
]
